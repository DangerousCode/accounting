package com.ust.calc.calculadora.services.impl;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.clients.CalculadoraDivisionClient;
import com.ust.calc.calculadora.clients.CalculadoraMultiplicacionClient;
import com.ust.calc.calculadora.clients.CalculadoraRestaClient;
import com.ust.calc.calculadora.clients.CalculadoraSumaClient;
import com.ust.calc.calculadora.services.ICalculadoraService;

@Service
public class CalculadoraServiceImpl implements ICalculadoraService {
	
	private CalculadoraMultiplicacionClient multipClient;
	private CalculadoraDivisionClient divisionClient;
	private CalculadoraRestaClient substClient;
	private CalculadoraSumaClient sumClient;
	
	public CalculadoraServiceImpl(CalculadoraMultiplicacionClient multipClient, CalculadoraDivisionClient divisionClient, CalculadoraRestaClient substClient, CalculadoraSumaClient sumClient) {
		this.multipClient = multipClient;
		this.divisionClient = divisionClient;
		this.substClient = substClient;
		this.sumClient = sumClient;
	}
    @Override
    public Integer doSum(Integer a, Integer b) {    	

        final Integer salida = sumClient.suma(a, b);
    	
        return salida;
    }
    
    @Override
    public Integer doSubtraction(Integer a, Integer b) {
    	
    	final Integer salida = substClient.resta(a, b);
    	
        return salida;
    }
	
    @Override
    public Integer doMultiplication(Integer a, Integer b) {
    	
    	final Integer salida = multipClient.multiply(a, b);
    	
        return salida;
    }
    
    @Override
    public Integer doDivide(Integer a, Integer b) {
    	
        final double salida = divisionClient.division(new Integer(a), new Integer(b));
    	
        return new Integer((int) salida);
    }    

}
