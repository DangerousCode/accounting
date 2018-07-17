package com.ust.calc.calculadora.api.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.impl.EmployeeCreationServiceImpl;
import com.ust.calc.calculadora.clients.DataSourceClient;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClient;
import com.ust.calc.calculadora.clients.integration.impl.IntegrationDSClientImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeCreationTest {

    private IEmployeeCreationService employeeCreationService;

    private @Mock
    Employee employee;

    private @Mock
    IntegrationDSClient integrationDSClient;
    
    private @Mock
    DataSourceClient dataSourceClient;

    @Before
    public void setUp() {
    	employeeCreationService = new EmployeeCreationServiceImpl(integrationDSClient);
    	integrationDSClient = new IntegrationDSClientImpl(dataSourceClient);
        employee = new Employee();
    }

    @Test
    public void testEmployeeCreation() {
    	EmployeeDS outputService = null;
    	final EmployeeDS inputClientCall = new EmployeeDS();
    	final EmployeeDS outputClientCall = new EmployeeDS();	
        when(integrationDSClient.newEmployee(inputClientCall)).thenReturn(outputClientCall);
        outputService = employeeCreationService.createEmployee(employee);
        assertThat(outputService).isNotNull();
    }

}