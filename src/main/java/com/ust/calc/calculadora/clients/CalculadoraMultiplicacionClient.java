package com.ust.calc.calculadora.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("http://localhost:8083")
public interface CalculadoraMultiplicacionClient {

	@RequestMapping(method = RequestMethod.GET, value = "/multiply/{one}/{two}")
	public Integer multiply(Integer multiplicando, Integer multiplicador);
}
