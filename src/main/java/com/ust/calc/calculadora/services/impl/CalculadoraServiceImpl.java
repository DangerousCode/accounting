package com.ust.calc.calculadora.services.impl;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.consumer.MultiplicacionConsumer;
import com.ust.calc.calculadora.services.ICalculadoraService;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {
	
    @Override
    public Integer doMultiply(Integer a, Integer b) {
    	
    	MultiplicacionConsumer multiplicacionConsumer = new MultiplicacionConsumer();
    	Integer salida = multiplicacionConsumer.multiplicacion(a, b);
    	
        return salida;
    }	

}
