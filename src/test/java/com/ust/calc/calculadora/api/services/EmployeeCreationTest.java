package com.ust.calc.calculadora.api.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.impl.EmployeeCreationServiceImpl;
import com.ust.calc.calculadora.clients.DataSourceClient;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

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
    	Employee outputService = new Employee();
    	final EmployeeDS inputClientCall = new EmployeeDS();
    	final ResponseEntity<EmployeeDS> outputClientCall = new ResponseEntity<EmployeeDS>(HttpStatus.OK);	
        when(employeeCreationWSClient.newEmployee(inputClientCall)).thenReturn(outputClientCall);
        outputService = employeeCreationService.createEmployee(employee);
        assertThat(outputService).isNotNull();
    }

}