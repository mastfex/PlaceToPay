package com.example.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.request.QueryRequest;
import com.example.demo.response.QueryResponse;
import com.example.demo.service.metodo.DemoMetodosService;
import com.example.demo.utils.GenerateAuth;

import reactor.core.publisher.Mono;


@Service
public class DemoService {
    
	DemoMetodosService metodos = new DemoMetodosService();


    
    public Mono<List<com.example.demo.response.TokenizeResponse>> postTokenize(com.example.demo.request.TokenizeRequest input) throws Exception{
	
		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		Mono<List<com.example.demo.response.TokenizeResponse>> output = metodos.tokenizeWebClient(input);
    	return output;
    
	}

	public Mono<List<QueryResponse>> getQuery(QueryRequest input) {

		Mono<List<QueryResponse>> output;

		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		input.setInternalReference(input.getInternalReference());
		

		output = metodos.queryWebClient(input);
		
		return output;
	}

	public Mono<List<com.example.demo.response.ProcessResponse>> postProcess(com.example.demo.request.ProcessRequest input){

	
		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());


		Mono<List<com.example.demo.response.ProcessResponse>> output = metodos.processWebClient(input);

		return output;
	}

}
