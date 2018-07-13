package com.ust.calc.calculadora.api.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeCreationService;
import com.ust.calc.calculadora.api.services.impl.EmployeeCreationServiceImpl;
import com.ust.calc.calculadora.clients.CalculadoraMultiplicacionClient;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.employee.consumers.EmployeeCreationWSClient;

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
    DataSourceClient employeeCreationWSClient;

    @Before
    public void setUp() {
        employeeCreationService = new EmployeeCreationServiceImpl(employeeCreationWSClient);
        employee = new Employee();
    }

    @Test
    public void testEmployeeCreation() {
    	final Employee outputService = new Employee();
    	final EmployeeDS outputClientCall = new EmployeeDS();
        when(employeeCreationWSClient.createEmployee(employee)).thenReturn(outputClientCall);
        outputService = employeeCreationService.createEmployee(employee);
        assertThat(outputService).isNotNull();
    }

}