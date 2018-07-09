package com.ust.calc.calculadora.services.impl;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.consumer.Consumer;
import com.ust.calc.calculadora.services.ICalculadoraService;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {
	
    @Override
    public Integer doSum(Integer a, Integer b) {
    	
    	Consumer consumer = new Consumer();
    	Integer salida = consumer.multiplicacion(a, b);
    	
        return salida;
    }
    
    @Override
    public Integer doSubtraction(Integer a, Integer b) {
    	
    	Consumer consumer = new Consumer();
    	Integer salida = consumer.multiplicacion(a, b);
    	
        return salida;
    }
	
    @Override
    public Integer doMultiply(Integer a, Integer b) {
    	
    	Consumer consumer = new Consumer();
    	Integer salida = consumer.multiplicacion(a, b);
    	
        return salida;
    }
    
    @Override
    public Integer doDivide(Integer a, Integer b) {
    	
    	Consumer consumer = new Consumer();
    	Integer salida = consumer.multiplicacion(a, b);
    	
        return salida;
    }    

}
