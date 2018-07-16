package com.ust.calc.calculadora.clients;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceClientTest {
	
	@Autowired
	DataSourceClient dataSourceClient;
	
	@Autowired
	ObjectMapper mapper;
	
	@Test
	public void happyTest() throws JsonProcessingException {
		
		final EmployeeDS employeeDS = new EmployeeDS();
		final ResponseEntity<EmployeeDS> httpResponse = dataSourceClient.newEmployee(employeeDS);
		assertEquals(httpResponse.getStatusCode(), HttpStatus.CREATED);
		
	}

}
