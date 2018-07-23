package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationResumeListDSClient;
import com.ust.calc.calculadora.clients.integration.impl.IntegrationResumeListDSClientImpl;

@RunWith(MockitoJUnitRunner.class)
public class IntegrationResumeListDSClientTest {
	
	private IntegrationResumeListDSClient integrationResumeListDSClient;
	
	@Mock
	private List<EmployeeDS> employeeResults;
	
	@Before
    public void setUp() {
		integrationResumeListDSClient = new IntegrationResumeListDSClientImpl();
    }
	
	@Test
	public void happyTest() throws JsonProcessingException {
		
    	when(integrationResumeListDSClient.resumeListEmployee()).thenReturn(employeeResults);
    	employeeResults = integrationResumeListDSClient.resumeListEmployee();
    	assertThat(employeeResults).isNotNull();
		
	}	

}
