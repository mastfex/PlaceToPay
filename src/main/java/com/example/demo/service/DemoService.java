package com.example.demo.service;

import com.example.demo.request.tokenize.Card;
import com.example.demo.request.tokenize.Input;
import com.example.demo.request.tokenize.Instrument;
import com.example.demo.request.tokenize.Payer;
import com.example.demo.response.tokenize.Output;
import com.example.demo.utils.GenerateAuth;
import com.fasterxml.jackson.core.sym.Name;

import reactor.core.publisher.Mono;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class DemoService {
    

    public String Template(String Name){
        return "¡Hola " + Name + "!";
    }
    
    public com.example.demo.response.tokenize.Output postTokenize(com.example.demo.request.tokenize.Input input){
    	com.example.demo.response.tokenize.Output output = new com.example.demo.response.tokenize.Output();
    	
    	Instrument instrument = new Instrument();
		Card card=new Card();
		Payer payer = new Payer();
		
		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		card.setNumber(input.getInstrument().getCard().getNumber());
		card.setCvv(input.getInstrument().getCard().getCvv());
		card.setExpirationMonth(input.getInstrument().getCard().getExpirationMonth());
		card.setExpirationYear((input.getInstrument().getCard().getExpirationYear()));   
		instrument.setCard(card);
		instrument.setOtp("");
		input.setInstrument(instrument);
		input.setIpAddress(input.getIpAddress());
		payer.setName(input.getPayer().getName());
		payer.setSurname(input.getPayer().getSurname());
		payer.setEmail(input.getPayer().getEmail());
		input.setPayer(payer);
		input.setUserAgent(input.getUserAgent());
		
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/tokenize").build())
				.body(Mono.just(input), Input.class)
				.retrieve()
				.bodyToMono(Output.class)
				.log()
				.block();
    	
    	output = (Output) clientFlux;
    	return output;
    }
}
