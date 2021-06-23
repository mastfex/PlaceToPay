package com.example.demo.service.metodo;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.domain.Amount;
import com.example.demo.domain.Instrument;
import com.example.demo.domain.Payment;
import com.example.demo.domain.Token;
import com.example.demo.request.ProcessRequest;
import com.example.demo.response.ProcessResponse;
import com.example.demo.utils.GenerateAuth;
import com.google.gson.Gson;

import reactor.core.publisher.Mono;


public class DemoProcessTransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoProcessTransaction.class);
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		DemoProcessTransaction demo=new DemoProcessTransaction();
		ProcessResponse output = processWebClient(demo.getInput());
		List<ProcessResponse> list=new ArrayList<ProcessResponse>();
		list.add(output);
		String json = new Gson().toJson(list );
		LOGGER.info("  ");
		LOGGER.info(" ---------RESPUESTA DE TRANSACCIÓN------------- ");
		LOGGER.info(json);
			
	}
	
	public ProcessRequest getInput() {
		ProcessRequest input = new ProcessRequest();
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
		amount.setTotal("20000");
		payment.setAmount(amount);
		payment.setDescription("Compra pasajes");
		payment.setReference("airline_test_2122694894");
		input.setPayment(payment);
		input.setUserAgent("Chrome \\/ 87");
		
		
		return input;
	}
	
	private static ProcessResponse processWebClient(ProcessRequest json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://test.placetopay.ec/rest").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/gateway/process").build())
				.body(Mono.just(json), ProcessRequest.class)
				.retrieve()
				.bodyToMono(ProcessResponse.class)
				.log()
				.block();

	}

}
