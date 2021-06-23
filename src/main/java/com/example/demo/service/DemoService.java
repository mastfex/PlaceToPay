package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.request.MpiLookupRequest;
import com.example.demo.request.ProcessRequest;
import com.example.demo.request.QueryRequest;
import com.example.demo.request.TokenizeRequest;
import com.example.demo.response.MpiLookupResponse;
import com.example.demo.response.ProcessResponse;
import com.example.demo.response.QueryResponse;
import com.example.demo.response.TokenizeResponse;
import com.example.demo.utils.GenerateAuth;
import com.example.demo.utils.WebClientImpl;

import reactor.core.publisher.Mono;

@Service
public class DemoService {

	WebClientImpl metodos = new WebClientImpl();

	public Mono<List<TokenizeResponse>> postTokenize(TokenizeRequest input) throws Exception {

		GenerateAuth oauth = new GenerateAuth();
		input.setAuth(oauth.getAuth());
		Mono<List<TokenizeResponse>> output = metodos.tokenizeWebClient(input);
		return output;

	}

	public Mono<List<QueryResponse>> getQuery(QueryRequest input) {

		Mono<List<QueryResponse>> output;

		GenerateAuth oauth = new GenerateAuth();
		input.setAuth(oauth.getAuth());
		input.setInternalReference(input.getInternalReference());

		output = metodos.queryWebClient(input);

		return output;
	}

	public Mono<List<ProcessResponse>> postProcess(ProcessRequest input) {
		GenerateAuth oauth = new GenerateAuth();
		input.setAuth(oauth.getAuth());
		Mono<List<ProcessResponse>> output = metodos.processWebClient(input);

		return output;
	}

	public Mono<List<MpiLookupResponse>> getMpiLookup(MpiLookupRequest input) {
		GenerateAuth oauth = new GenerateAuth();
		input.setAuth(oauth.getAuth());
		Mono<List<MpiLookupResponse>> output = metodos.lookupWebClient(input);

		return output;
	}

}
