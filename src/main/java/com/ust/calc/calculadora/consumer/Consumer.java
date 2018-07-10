package com.ust.calc.calculadora.consumer;

import org.springframework.web.client.RestTemplate;

public class Consumer {
	
	public int sum(int one, int two) {
		
		int respuesta = 0;
		
		String requestUrl = "http://localhost:8080/multiply?one=" + Integer.toString(one) + "&two=" + Integer.toString(two);
		respuesta = Integer.parseInt(new RestTemplate().getForObject(requestUrl, String.class));
		
		return respuesta;
	}
	
	public int subtraction(int one, int two) {
		
		int respuesta = 0;
		
		String requestUrl = "http://localhost:8080/multiply?one=" + Integer.toString(one) + "&two=" + Integer.toString(two);
		respuesta = Integer.parseInt(new RestTemplate().getForObject(requestUrl, String.class));
		
		return respuesta;
	}
	
	public int multiplication(int one, int two) {
		
		int respuesta = 0;
		
		String requestUrl = "http://localhost:8080/multiply?one=" + Integer.toString(one) + "&two=" + Integer.toString(two);
		respuesta = Integer.parseInt(new RestTemplate().getForObject(requestUrl, String.class));
		
		return respuesta;
	}
	
	public int divide(int one, int two) {
		
		int respuesta = 0;
		
		String requestUrl = "http://localhost:8080/multiply?one=" + Integer.toString(one) + "&two=" + Integer.toString(two);
		respuesta = Integer.parseInt(new RestTemplate().getForObject(requestUrl, String.class));
		
		return respuesta;
	}

}
