package com.ust.calc.calculadora.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ust.calc.calculadora.services.ICalculadoraService;

@RestController
public class CalculadoraController implements Calculadora {

	private final ICalculadoraService calculadoraService;

    public CalculadoraController(final ICalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }
    
    @Override
    @RequestMapping("/calculo")
	public Integer doCalculos(@RequestParam(value="one") Integer one, @RequestParam(value="two") Integer two) {
		//return calculadoraService.doMultiply(one, two);
    	return 1;
	}
}
