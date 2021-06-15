package com.example.demo.service.metodo;

import java.util.List;

import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class DemoMetodosService {
    
    public Mono<List<com.example.demo.response.tokenize.Output>> tokenizeWebClient(com.example.demo.request.tokenize.Input json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/tokenize").build())
				.body(Mono.just(json), com.example.demo.request.tokenize.Input.class)
				.retrieve()
				.bodyToFlux(com.example.demo.response.tokenize.Output.class)
				.collectList()
				.log();
				


	}

    public Mono<List<com.example.demo.response.transaction.Output>> processWebClient(com.example.demo.request.transaction.Input json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/process").build())
				.body(Mono.just(json), com.example.demo.request.transaction.Input.class)
				.retrieve()
				.bodyToFlux(com.example.demo.response.transaction.Output.class)
				.collectList()
				.log();

	}

    public com.example.demo.response.query.OutputQuery tokenizeWebClient(com.example.demo.request.query.InputQuery json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/query").build())
				.body(Mono.just(json), com.example.demo.request.query.InputQuery.class)
				.retrieve()
				.bodyToMono(com.example.demo.response.query.OutputQuery.class)
				.log()
				.block();

	}
    
    public com.example.demo.response.query.OutputQuery queryWebClient(com.example.demo.request.query.InputQuery json) {
    	WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/query").build())
				.body(Mono.just(json), com.example.demo.request.query.InputQuery.class)
				.retrieve()
				.bodyToMono(com.example.demo.response.query.OutputQuery.class)
				.log()
				.block();

	}

}
