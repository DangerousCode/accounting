package com.ust.calc.calculadora.clients;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.clients.impl.EmployeeDeleteClientImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDeleteClientImplTest {

	private EmployeeDeleteClient employeeDeleteClient;
	
	@Before
	public void setup() {
		employeeDeleteClient = new EmployeeDeleteClientImpl(); 
	}
	
	@Test
	public void happyTest() {
		employeeDeleteClient.deleteEmployee(1);
	}
}
