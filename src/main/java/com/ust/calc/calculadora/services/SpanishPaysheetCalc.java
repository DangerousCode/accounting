package com.ust.calc.calculadora.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.CalculadoraMultiplicacionClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Implementation of calc spanish Paysheet
 */
@Component
@RequiredArgsConstructor
public class SpanishPaysheetCalc implements PaysheetCalc<Employee> {

    public static final int SUELDO_BASE = 1000;

    private final CalculadoraMultiplicacionClient multiplicacionClient;

    @Override
    public BigDecimal calulation(final Employee employee) {
        return BigDecimal.valueOf(multiplicacionClient.multiply(employee.getPosition(), SUELDO_BASE));
    }

}
