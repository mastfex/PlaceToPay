package com.request.autorizacion;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenerateAuth {
	private static final Logger LOGGER = LoggerFactory.getLogger(GenerateAuth.class);
	
	public Auth getAuth() {
		Auth auth=new Auth();
		String login="1863f8a3ba0e8d4290137c4b18fa4286";
		String seed;
		String nonce;
		String tranKey="97d3E70wO36CoQjS";
		try {
			String chars = "0123456789abcdefghijklmnopqrstuvwxyz";
			Random rnd = new Random();
			StringBuilder sb = new StringBuilder(11);
				for (int i = 0; i < 11; i++)
					sb.append(chars.charAt(rnd.nextInt(chars.length())));
			nonce = sb.toString();
			LOGGER.info(" nonce inicial : " +nonce );
			seed = (new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", Locale.getDefault())).format(new Date());	
			auth.setLogin(login);
			auth.setTranKey(base64(sha1(nonce + seed + tranKey)));
			auth.setNonce(base64(nonce.getBytes()));
			auth.setSeed(seed);
			LOGGER.info("auth: "+auth.getTranKey() +" nonce: " +auth.getNonce() );
			return auth;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return auth;
		}

		
	}
	
	static byte[] sha1(String input) throws NoSuchAlgorithmException {
		MessageDigest mDigest = MessageDigest.getInstance("SHA256");
		return mDigest.digest(input.getBytes());
	}

	static String sha1String(String input) throws NoSuchAlgorithmException {
		MessageDigest mDigest = MessageDigest.getInstance("SHA256");
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
}
