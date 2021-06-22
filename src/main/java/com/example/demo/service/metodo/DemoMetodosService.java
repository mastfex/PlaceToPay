package com.example.demo.service.metodo;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.request.QueryRequest;
import com.example.demo.response.QueryResponse;

import reactor.core.publisher.Mono;

public class DemoMetodosService {
    
    public Mono<List<com.example.demo.response.TokenizeResponse>> tokenizeWebClient(com.example.demo.request.TokenizeRequest json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/tokenize").build())
		        .accept(MediaType.APPLICATION_JSON)
		        .contentType(MediaType.APPLICATION_JSON)
				.body(Mono.just(json), com.example.demo.request.TokenizeRequest.class)
				.retrieve()
				.bodyToFlux(com.example.demo.response.TokenizeResponse.class)
		        .collectList()
		        .log();
				


	}

    public Mono<List<com.example.demo.response.ProcessResponse>> processWebClient(com.example.demo.request.ProcessRequest json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/process").build())
		        .accept(MediaType.APPLICATION_JSON)
		        .contentType(MediaType.APPLICATION_JSON)
				.body(Mono.just(json), com.example.demo.request.ProcessRequest.class)
				.retrieve()
				.bodyToFlux(com.example.demo.response.ProcessResponse.class)
		        .collectList()
		        .log();

	}

    
    public Mono<List<QueryResponse>>  queryWebClient(com.example.demo.request.QueryRequest json) {
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

}
