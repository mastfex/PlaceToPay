package com.example.demo.service;

import com.example.demo.utils.GenerateAuth;

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
    	
    	com.example.demo.request.tokenize.Instrument instrument = new com.example.demo.request.tokenize.Instrument();
		com.example.demo.request.tokenize.Card card=new com.example.demo.request.tokenize.Card();
		com.example.demo.request.tokenize.Payer payer = new com.example.demo.request.tokenize.Payer();
		
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
				.body(Mono.just(input), com.example.demo.request.tokenize.Input.class)
				.retrieve()
				.bodyToMono(com.example.demo.response.tokenize.Output.class)
				.log()
				.block();
    	
    	output = (com.example.demo.response.tokenize.Output) clientFlux;
    	return output;
    }

	public com.example.demo.response.query.OutputQuery getQuery(com.example.demo.request.query.InputQuery input) {

		com.example.demo.response.query.OutputQuery output = new com.example.demo.response.query.OutputQuery();

		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		input.setInternalReference(input.getInternalReference());

		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/query").build())
				.body(Mono.just(input), com.example.demo.request.query.InputQuery.class)
				.retrieve()
				.bodyToMono(com.example.demo.response.query.OutputQuery.class)
				.log()
				.block();

		output = (com.example.demo.response.query.OutputQuery) clientFlux;
		
		return output;
	}

	public com.example.demo.response.transaction.Output postProcess(com.example.demo.request.transaction.Input input){

		com.example.demo.response.transaction.Output output = new com.example.demo.response.transaction.Output();

		com.example.demo.request.transaction.Instrument instrument = new com.example.demo.request.transaction.Instrument();
		com.example.demo.request.transaction.Payment payment = new com.example.demo.request.transaction.Payment();
		com.example.demo.request.transaction.Amount amount= new com.example.demo.request.transaction.Amount();
		com.example.demo.request.transaction.Token token = new com.example.demo.request.transaction.Token();	
		
		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		input.setAdditional(input.getAdditional());
		token.setToken("190b0625456b177b779c40b7d0bbf31b3aa831b882e578ff04b71857908f1af0");
		instrument.setToken(token);
		input.setInstrument(instrument);
		input.setIpAddress(input.getIpAddress());
		amount.setCurrency("USD");
		amount.setTotal(20000);
		payment.setAmount(amount);
		payment.setDescription("Compra pasajes");
		payment.setReference("airline_test_2122694894");
		input.setPayment(payment);
		input.setUserAgent(input.getUserAgent());

		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/process").build())
				.body(Mono.just(input), com.example.demo.request.transaction.Input.class)
				.retrieve()
				.bodyToMono(com.example.demo.response.transaction.Output.class)
				.log()
				.block();

		
		output = (com.example.demo.response.transaction.Output) clientFlux;
		return output;
	}

}
