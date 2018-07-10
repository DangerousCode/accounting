package com.ust.calc.calculadora.services.impl;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.clients.CalculadoraMultiplicacionClient;
import com.ust.calc.calculadora.consumer.Consumer;
import com.ust.calc.calculadora.services.ICalculadoraService;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {
	
	private CalculadoraMultiplicacionClient multipClient;
	
	public CalculadoraServiceImpl(CalculadoraMultiplicacionClient multipClient) {
		this.multipClient = multipClient;
	}
    @Override
    public Integer doSum(Integer a, Integer b) {    	

    	Consumer consumer = new Consumer();
    	Integer salida = consumer.multiplication(a, b);
    	
        return salida;
    }
    
    @Override
    public Integer doSubtraction(Integer a, Integer b) {
    	
    	Consumer consumer = new Consumer();
    	Integer salida = consumer.multiplication(a, b);
    	
        return salida;
    }
	
    @Override
    public Integer doMultiplication(Integer a, Integer b) {
    	
//    	Consumer consumer = new Consumer();
//    	Integer salida = consumer.multiplication(a, b);
    	Integer salida = multipClient.multiply(a, b);
    	
        return salida;
    }
    
    @Override
    public Integer doDivide(Integer a, Integer b) {
    	
    	Consumer consumer = new Consumer();
    	Integer salida = consumer.multiplication(a, b);
    	
        return salida;
    }    

}
