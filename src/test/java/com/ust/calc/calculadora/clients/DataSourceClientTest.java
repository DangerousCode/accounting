package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceClientTest {
	
	@Autowired
	DataSourceClient dataSourceClient;
	
	@Test
	public void happyTest() throws JsonProcessingException {
		
		final EmployeeDS employeeDS = new EmployeeDS();
		final ResponseEntity<EmployeeDS> httpResponse = dataSourceClient.newEmployee(employeeDS);
		assertEquals(httpResponse.getStatusCode(), HttpStatus.CREATED);
		
	}
	
	@Test
	public void nohappyTestRequestTimeout() throws JsonProcessingException {
		
		final EmployeeDS employeeDS = new EmployeeDS();
		final ResponseEntity<EmployeeDS> httpResponse = dataSourceClient.newEmployee(employeeDS);
		assertThat(httpResponse.getStatusCode()).isNotEqualByComparingTo(HttpStatus.REQUEST_TIMEOUT);
		
	}
	
	@Test
	public void nohappyTestUnauthorized() throws JsonProcessingException {
		
		final EmployeeDS employeeDS = new EmployeeDS();
		final ResponseEntity<EmployeeDS> httpResponse = dataSourceClient.newEmployee(employeeDS);
		assertThat(httpResponse.getStatusCode()).isNotEqualByComparingTo(HttpStatus.UNAUTHORIZED);
		
	}

}
