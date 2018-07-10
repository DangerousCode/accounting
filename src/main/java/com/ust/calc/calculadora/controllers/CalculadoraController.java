package com.ust.calc.calculadora.controllers;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.calc.calculadora.services.ICalculadoraService;

@Deprecated
//@RestController
@EnableFeignClients
public class CalculadoraController implements Calculadora {

	private final ICalculadoraService calculadoraService;

    public CalculadoraController(final ICalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }
    
    @Override
    @RequestMapping("/calculo")
	public Integer doCalculos(@RequestParam(value="one") Integer one, 
			@RequestParam(value="two") Integer two,
			@RequestParam(value="three") Integer three,
			@RequestParam(value="four") Integer four) {
    	
    	Integer salida = 0; 
		salida = calculadoraService.doMultiplication(one, two);
		salida = calculadoraService.doMultiplication(salida, three);
		salida = calculadoraService.doMultiplication(salida, four);
		return salida;
		
	}
}
