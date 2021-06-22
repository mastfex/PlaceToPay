package com.example.demo.service.metodo;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;

import com.google.gson.Gson;
import com.example.demo.utils.GenerateAuth;

import reactor.core.publisher.Mono;

import com.example.demo.domain.Card;
import com.example.demo.domain.Instrument;
import com.example.demo.domain.Payer;
import com.example.demo.request.TokenizeRequest;
import com.example.demo.response.TokenizeResponse;

public class DemoTokenize {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoTokenize.class);
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		DemoTokenize demo=new DemoTokenize();
		TokenizeResponse output = tokenizeWebClient(demo.getInput());
		List<TokenizeResponse> list=new ArrayList<TokenizeResponse>();
		list.add(output);
		String json = new Gson().toJson(list );
		LOGGER.info("  ");
		LOGGER.info(" ---------TOKENIZER DE TARJETAS TC------------- ");
		LOGGER.info(json);
			
	}
	
	public TokenizeRequest getInput() {
		TokenizeRequest input = new TokenizeRequest();
		Instrument instrument = new Instrument();
		Card card=new Card();
		Payer payer = new Payer();
		
		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		card.setNumber("4111111111111111");
		card.setCvv("123");
		card.setExpirationMonth("05");
		card.setExpirationYear("21");
		instrument.setCard(card);
		instrument.setOtp("");
		input.setInstrument(instrument);
		input.setIpAddress("157.100.171.150");
		payer.setName("Luis");
		payer.setSurname("Castro");
		payer.setEmail("lcastro@yopmail.com");
		input.setPayer(payer);
		input.setUserAgent("Chrome \\/ 87");
		return input;
	}
	
	private static TokenizeResponse tokenizeWebClient(TokenizeRequest json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/tokenize").build())
				.body(Mono.just(json), TokenizeRequest.class)
				.retrieve()
				.bodyToMono(TokenizeResponse.class)
				.log()
				.block();

	}

}
