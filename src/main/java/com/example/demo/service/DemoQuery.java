package com.example.demo.service;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;

import com.request.autorizacion.GenerateAuth;

import query.request.InputQuery;
import query.response.OutputQuery;
import reactor.core.publisher.Mono;
import tokenize.request.Card;
import tokenize.request.Input;
import tokenize.request.Instrument;
import tokenize.request.Payer;
import tokenize.response.Output;


public class DemoQuery {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoQuery.class);
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		DemoQuery demo=new DemoQuery();
		OutputQuery output = tokenizeWebClient(demo.getInput());
		List<OutputQuery> list=new ArrayList<OutputQuery>();
		list.add(output);
		String json = new Gson().toJson(list );
		LOGGER.info("  ");
		LOGGER.info(" ---------RESPUESTA DE TRANSACCIÓN------------- ");
		LOGGER.info(json);
			
	}
	
	public InputQuery getInput() {
		InputQuery input = new InputQuery();
		
		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		input.setInternalReference("206629");
		
		
		return input;
	}
	
	private static OutputQuery tokenizeWebClient(InputQuery json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/query").build())
				.body(Mono.just(json), InputQuery.class)
				.retrieve()
				.bodyToMono(OutputQuery.class)
				.log()
				.block();

	}

}
