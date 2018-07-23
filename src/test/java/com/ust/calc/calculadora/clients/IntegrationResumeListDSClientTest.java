package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationResumeListDSClient;
import com.ust.calc.calculadora.clients.integration.impl.IntegrationResumeListDSClientImpl;

@RunWith(MockitoJUnitRunner.class)
public class IntegrationResumeListDSClientTest {
	
	private IntegrationResumeListDSClient integrationResumeListDSClient;
	
	@Mock
	private List<EmployeeDS> employeeResults;
	
	@Mock
	private RestTemplate restTemplate;
	
	@Mock
	private LinkedHashMap response;
	
	@Mock
	private LinkedHashMap _embedded;
	
	@Mock
	private ArrayList data;
	
	
	@Before
    public void setUp() {
		integrationResumeListDSClient = new IntegrationResumeListDSClientImpl(restTemplate);
    }
	
	@Test
	public void happyTest() throws JsonProcessingException {
    	
		when( (LinkedHashMap)restTemplate.getForObject("http://localhost:8080/data", Object.class) ).thenReturn( response );
		when( (LinkedHashMap)response.get("_embedded") ).thenReturn( _embedded );
		when( (ArrayList)_embedded.get("data") ).thenReturn( data );
		
    	employeeResults = integrationResumeListDSClient.resumeListEmployee();
    	assertThat(employeeResults).isNotNull();
		
	}	

}
