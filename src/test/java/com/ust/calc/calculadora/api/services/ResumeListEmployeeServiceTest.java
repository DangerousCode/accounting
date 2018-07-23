package com.ust.calc.calculadora.api.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.converters.EmployeeDSToEmployeeConverter;
import com.ust.calc.calculadora.api.services.converters.EmployeeToEmployeeDSConverter;
import com.ust.calc.calculadora.api.services.impl.EmployeeCreationServiceImpl;
import com.ust.calc.calculadora.api.services.impl.EmployeeResumeListServiceImpl;
import com.ust.calc.calculadora.clients.DataSourceClient;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClient;
import com.ust.calc.calculadora.clients.integration.IntegrationResumeListDSClient;

@RunWith(MockitoJUnitRunner.class)
public class ResumeListEmployeeServiceTest {
	
    private IEmployeeResumeListService employeeResumeListService;

    private @Mock
    IntegrationResumeListDSClient integrationResumeListDSClient;
    
    private @Mock
    DataSourceClient dataSourceClient;
    
    private @Mock 
    EmployeeToEmployeeDSConverter converterEmployeeToEmployeeDS;
	private @Mock 
	EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee;

    @Before
    public void setUp() {
    	employeeResumeListService = new EmployeeResumeListServiceImpl(integrationResumeListDSClient, converterEmployeeDSToEmployee);
    }

    @Test
    public void testEmployeeResumeList() { 
    	List<EmployeeDS> employeesDS = new ArrayList<EmployeeDS>();
        when(integrationResumeListDSClient.resumeListEmployee()).thenReturn(employeesDS);
        List<Employee> employees = employeeResumeListService.resumeListEmployee();
        assertThat(employees).isNotNull();
    }	

}
