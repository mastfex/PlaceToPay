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

    public String Template(String Name){
        return "¡Hola " + Name + "!";
    }
    
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

		//output = (com.example.demo.response.transaction.Output) metodos.processWebClient(input);

		return output;
	}

}
