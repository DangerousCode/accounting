package com.ust.calc.calculadora.consumer;

import org.springframework.web.client.RestTemplate;

public class MultiplicacionConsumer {
	
	public int multiplicacion(int one, int two) {
		
		int respuesta = 0;
		
		String requestUrl = "http://localhost:8080/multiply?one=" + Integer.toString(one) + "&two=" + Integer.toString(two);
		respuesta = Integer.parseInt(new RestTemplate().getForObject(requestUrl, String.class));
		
		return respuesta;
	}

}
