package com.ust.calc.calculadora.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.CalculadoraMultiplicacionClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Implementation of calc spanish Paysheet
 */
@Component
@RequiredArgsConstructor
@Slf4j
public class SpanishPaysheetCalc implements PaysheetCalc<Employee> {

    public static final int SUELDO_BASE = 1000;

    private final CalculadoraMultiplicacionClient multiplicacionClient;

    @Override
    public BigDecimal calulation(final Employee employee) {
        final Integer multiply = multiplicacionClient.multiply(employee.getPosition(), SUELDO_BASE);
        log.info("multiply:{}", multiply);
        return BigDecimal.valueOf(multiply);
    }

}
