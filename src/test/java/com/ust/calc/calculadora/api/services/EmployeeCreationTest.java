package com.ust.calc.calculadora.api.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeCreationService;
import com.ust.calc.calculadora.clients.CalculadoraMultiplicacionClient;
import com.ust.calc.calculadora.employee.consumers.EmployeeCreationWSClient;
import com.ust.calc.calculadora.employee.services.impl.EmployeeCreationServiceImpl;

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
    EmployeeCreationWSClient employeeCreationWSClient;

    @Before
    public void setUp() {
        employeeCreationService = new EmployeeCreationServiceImpl(employeeCreationWSClient);
        employee = new Employee();
    }

    @Test
    public void calulation() {
        when(employeeCreationWSClient.createEmployee(employee)).thenReturn(10);
        final BigDecimal amount = employeeCreationService.createEmployee(employee);
        assertThat(amount).isEqualTo(BigDecimal.TEN);
    }

}