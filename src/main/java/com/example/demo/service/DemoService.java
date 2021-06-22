package com.example.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.request.query.InputQuery;
import com.example.demo.response.query.OutputQuery;
import com.example.demo.service.metodo.DemoMetodosService;
import com.example.demo.utils.GenerateAuth;

import reactor.core.publisher.Mono;


@Service
public class DemoService {
    
	DemoMetodosService metodos = new DemoMetodosService();


    
    public Mono<List<com.example.demo.response.tokenize.Output>> postTokenize(com.example.demo.request.tokenize.Input input) throws Exception{
	
		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		Mono<List<com.example.demo.response.tokenize.Output>> output = metodos.tokenizeWebClient(input);
    	return output;
    
	}

	public Mono<List<OutputQuery>> getQuery(InputQuery input) {

		Mono<List<OutputQuery>> output;

		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		input.setInternalReference(input.getInternalReference());
		

		output = metodos.queryWebClient(input);
		
		return output;
	}

	public Mono<List<com.example.demo.response.transaction.Output>> postProcess(com.example.demo.request.transaction.Input input){

	
		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());


		Mono<List<com.example.demo.response.transaction.Output>> output = metodos.processWebClient(input);

		return output;
	}

}
