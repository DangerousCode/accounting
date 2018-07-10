package com.ust.calc.calculadora.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("http://localhost:8083")
public interface CalculadoraMultiplicacionClient {

	@RequestMapping(method = RequestMethod.GET, value = "/multiply")
	public Integer multiply(@RequestParam(name="one") Integer one, @RequestParam(name="two") Integer two);
}
