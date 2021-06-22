package com.example.demo.service.metodo;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.utils.GenerateAuth;
import com.example.demo.domain.Card;
import com.example.demo.domain.Instrument;
import com.example.demo.domain.Payer;

import reactor.core.publisher.Mono;

import com.example.demo.request.QueryRequest;
import com.example.demo.request.TokenizeRequest;
import com.example.demo.response.QueryResponse;
import com.example.demo.response.TokenizeResponse;


public class DemoQuery {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoQuery.class);
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		DemoQuery demo=new DemoQuery();
		QueryResponse output = tokenizeWebClient(demo.getInput());
		List<QueryResponse> list=new ArrayList<QueryResponse>();
		list.add(output);
		String json = new Gson().toJson(list );
		LOGGER.info("  ");
		LOGGER.info(" ---------RESPUESTA DE TRANSACCIÓN------------- ");
		LOGGER.info(json);
			
	}
	
	public QueryRequest getInput() {
		QueryRequest input = new QueryRequest();
		
		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		input.setInternalReference("206629");
		
		
		return input;
	}
	
	private static QueryResponse tokenizeWebClient(QueryRequest json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/query").build())
				.body(Mono.just(json), QueryRequest.class)
				.retrieve()
				.bodyToMono(QueryResponse.class)
				.log()
				.block();

	}

}
