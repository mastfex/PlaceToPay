package com.example.demo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;
import com.example.demo.request.id.estructura.RequestInput;
import com.example.demo.request.create.estructura.Amount;
import com.example.demo.request.create.estructura.Auth;
import com.example.demo.request.create.estructura.Buyer;
import com.example.demo.request.create.estructura.CreateInput;
import com.example.demo.request.create.estructura.Payment;
import com.example.demo.response.id.estructura.RequestOutput;
import com.example.demo.response.create.estructura.CreateOutput;

@SpringBootApplication
public class DemoApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
	protected static String seed;
	protected static String nonce;
	protected static String requestId;

	public static void main(String[] args) throws NoSuchAlgorithmException {

		SpringApplication.run(DemoApplication.class, args);
		
		CreateOutput create = createRequestWebClient(getCreateInput());
		requestId= create.getRequestId();
		RequestOutput request= requestIdWebClient(getRequestInput());
		
		LOGGER.info(" ");
		LOGGER.info("Respuesta createRequest:");
		LOGGER.info("status: "+create.getStatus().getStatus());
		LOGGER.info("reason: "+create.getStatus().getReason());
		LOGGER.info("message: "+create.getStatus().getMessage());
		LOGGER.info("date: "+create.getStatus().getDate());
		LOGGER.info("requestId: "+create.getRequestId());
		LOGGER.info("processUrl: "+create.getProcessUrl());
		LOGGER.info(" ");
		LOGGER.info("Respuesta requestID:");
		LOGGER.info(request.toString());
	    
	}

	private static CreateInput getCreateInput() throws NoSuchAlgorithmException {

		CreateInput input = new CreateInput();
		Buyer buyer = new Buyer();
		Payment payment = new Payment();
		Amount amount = new Amount();
		input.setAuth(generateAuth());
		input.setIpAddress("127.0.0.1");

		payment.setAllowPartial("false");
		amount.setCurrency("CLP");
		amount.setTotal("10000");
		payment.setAmount(amount);
		payment.setDescription("Pago básico de prueba 04032019");
		payment.setReference("3210");

		input.setPayment(payment);
		input.setExpiration("2021-06-08T00:00:00-05:00");
		input.setUserAgent("PlacetoPay Sandbox");
		input.setLocale("en_CO");
		input.setReturnUrl("https://mysite.com/response/3210");

		buyer.setDocument("1040035000");
		buyer.setDocumentType("CC");
		buyer.setEmail("dnetix@yopmail.com");
		buyer.setMobile("3006108300");
		buyer.setName("Deion");
		buyer.setSurname("Ondricka");

		input.setBuyer(buyer);

		return input;
	}
	
	private static RequestInput getRequestInput() throws NoSuchAlgorithmException  {
		RequestInput request = new RequestInput();
		request.setAuth(generateAuth());
		return request;
	}
	
	// Metodo que genera la Autenticación.
	public static Auth generateAuth() throws NoSuchAlgorithmException {
		Auth auth = new Auth();
		nonce = new BigInteger(130, new SecureRandom()).toString();
		seed = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", Locale.getDefault())).format(new Date());

		auth.setLogin("e29688bfeb1c6b991eb37d99f5d63441");
		auth.setTranKey(base64(sha1(nonce + seed + "7m2iSW7Rp4IPNbbr")));

		auth.setNonce(base64(nonce.getBytes()));
		auth.setSeed(seed);
		return auth;
	}

	static byte[] sha1(String input) throws NoSuchAlgorithmException {
		MessageDigest mDigest = MessageDigest.getInstance("SHA1");
		return mDigest.digest(input.getBytes());
	}

	static String sha1String(String input) throws NoSuchAlgorithmException {
		MessageDigest mDigest = MessageDigest.getInstance("SHA1");
		byte[] result = mDigest.digest(input.getBytes());
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < result.length; i++) {
			sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}

	static String base64(byte[] input) {
		byte[] encodedBytes = (Base64.getEncoder()).encode(input);
		return new String(encodedBytes);
	}

	private static CreateOutput createRequestWebClient(CreateInput json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://cl-uat-checkout.placetopay.com/").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("api/session").build())
				.body(Mono.just(json), CreateInput.class)
				.retrieve()
				.bodyToMono(CreateOutput.class)
				.log()
				.block();

	}
	
	private static RequestOutput requestIdWebClient(RequestInput json) {
		WebClient clientFlux = WebClient.builder().baseUrl("https://cl-uat-checkout.placetopay.com/").build();
		return clientFlux.post().uri(uriBuilder -> uriBuilder.path("/api/session/"+requestId).build())
				.body(Mono.just(json), CreateInput.class)
				.retrieve()
				.bodyToMono(RequestOutput.class)
				.log()
				.block();

	}

}
