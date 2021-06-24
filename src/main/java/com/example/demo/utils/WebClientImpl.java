package com.example.demo.utils;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.request.MpiLookupRequest;
import com.example.demo.request.ProcessRequest;
import com.example.demo.request.QueryRequest;
import com.example.demo.request.TokenizeRequest;
import com.example.demo.response.MpiLookupResponse;
import com.example.demo.response.ProcessResponse;
import com.example.demo.response.QueryResponse;
import com.example.demo.response.TokenizeResponse;

import reactor.core.publisher.Mono;

public class WebClientImpl {
    
    public Mono<List<TokenizeResponse>> tokenizeWebClient(TokenizeRequest json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/tokenize").build())
		        .accept(MediaType.APPLICATION_JSON)
		        .contentType(MediaType.APPLICATION_JSON)
				.body(Mono.just(json), TokenizeRequest.class)
				.retrieve()
				.bodyToFlux(com.example.demo.response.TokenizeResponse.class)
		        .collectList()
		        .log();
				

	}

    public Mono<List<ProcessResponse>> processWebClient(com.example.demo.request.ProcessRequest json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/process").build())
		        .accept(MediaType.APPLICATION_JSON)
		        .contentType(MediaType.APPLICATION_JSON)
				.body(Mono.just(json), ProcessRequest.class)
				.retrieve()
				.bodyToFlux(com.example.demo.response.ProcessResponse.class)
		        .collectList()
		        .log();

	}

    
    public Mono<List<QueryResponse>>  queryWebClient(QueryRequest json) {
    	
    	WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/query").build())
		        .accept(MediaType.APPLICATION_JSON)
		        .contentType(MediaType.APPLICATION_JSON)
				.body(Mono.just(json), QueryRequest.class)
				.retrieve()
				.bodyToFlux(QueryResponse.class)
		        .collectList()
		        .log();

	}
    
    public Mono<List<MpiLookupResponse>>  lookupWebClient(MpiLookupRequest json) {
    	WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/mpi/lookup").build())
		        .accept(MediaType.APPLICATION_JSON)
		        .contentType(MediaType.APPLICATION_JSON)
				.body(Mono.just(json), MpiLookupRequest.class)
				.retrieve()
				.bodyToFlux(MpiLookupResponse.class)
		        .collectList()
		        .log();

	}

}
