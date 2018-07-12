package com.ust.calc.calculadora.employee.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.CalculadoraMultiplicacionClient;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeCreationTest {

    private IEmployeeCreationService employeeCreationService;

    private @Mock
    Employee employee;

    private @Mock
    CalculadoraMultiplicacionClient multiplicacionClient;

    @Before
    public void setUp() {
        employeeCreationService = new EmployeeCreationServiceImpl(multiplicacionClient);
    }

    @Test
    public void calulation() {
        when(multiplicacionClient.multiply(anyInt(), anyInt())).thenReturn(10);
        final BigDecimal amount = spanishPaysheetCalc.calulation(employee);
        assertThat(amount).isEqualTo(BigDecimal.TEN);
    }

}