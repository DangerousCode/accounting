package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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
	
	EmployeeDS employeeDS;
	
	@Autowired
	ObjectMapper mapper;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void happyTest() throws JsonProcessingException {
		
		employeeDS = new EmployeeDS(null, "Raquel", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		
		ResponseEntity<EmployeeDS> resultado = dataSourceClient.newEmployee(employeeDS);
		
		EmployeeDS employee =resultado.getBody();
		
		assertEquals(employee.getName(), "Raquel");
		
	}
	
	@Test
	public void nohappyTest() throws JsonProcessingException {
		
		employeeDS = new EmployeeDS(null, "Carlos", null, null, null, null, null, null, null, null, null, null, null, null, null, null);
		
		ResponseEntity<EmployeeDS> resultado = dataSourceClient.newEmployee(employeeDS);
		
		EmployeeDS employee =resultado.getBody();
		
		assertThat(employee.getName()).isNotEmpty();
		
		
	}

}
