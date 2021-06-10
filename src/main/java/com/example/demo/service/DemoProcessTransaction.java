package com.example.demo.service;

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
import com.example.demo.request.transaction.Amount;
import com.example.demo.request.transaction.Input;
import com.example.demo.request.transaction.Instrument;
import com.example.demo.request.transaction.Payment;
import com.example.demo.request.transaction.Token;
import com.example.demo.response.transaction.Output;


public class DemoProcessTransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoProcessTransaction.class);
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		DemoProcessTransaction demo=new DemoProcessTransaction();
		Output output = processWebClient(demo.getInput());
		List<Output> list=new ArrayList<Output>();
		list.add(output);
		String json = new Gson().toJson(list );
		LOGGER.info("  ");
		LOGGER.info(" ---------RESPUESTA DE TRANSACCIÓN------------- ");
		LOGGER.info(json);
			
	}
	
	public Input getInput() {
		Input input = new Input();
		Instrument instrument = new Instrument();
		Payment payment=new Payment();
		Amount amount= new Amount();
		Token token=new Token();	
		
		GenerateAuth oauth=new GenerateAuth();
		input.setAuth(oauth.getAuth());
		input.setAdditional("Luis castro");
		token.setToken("190b0625456b177b779c40b7d0bbf31b3aa831b882e578ff04b71857908f1af0");
		instrument.setToken(token);
		input.setInstrument(instrument);
		input.setIpAddress("157.100.171.150");
		amount.setCurrency("USD");
		amount.setTotal(20000);
		payment.setAmount(amount);
		payment.setDescription("Compra pasajes");
		payment.setReference("airline_test_2122694894");
		input.setPayment(payment);
		input.setUserAgent("Chrome \\/ 87");
		
		
		return input;
	}
	
	private static Output processWebClient(Input json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/process").build())
				.body(Mono.just(json), Input.class)
				.retrieve()
				.bodyToMono(Output.class)
				.log()
				.block();

	}

}
