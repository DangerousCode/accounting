package com.ust.calc.calculadora.clients;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.clients.impl.EmployeeDeleteClientImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDeleteClientImplTest {

	
	private EmployeeDeleteClient employeeDeleteClient;
	
	@Mock
	private DataSourceWSClientDelete dataSourceWSClientDelete;
	
	@Before
	public void setup() {
		employeeDeleteClient = new EmployeeDeleteClientImpl(dataSourceWSClientDelete); 
	}
	
	@Test
	public void happyTest() {
		Mockito.doNothing().when(dataSourceWSClientDelete).employeeDSDelete(Mockito.any());
		employeeDeleteClient.deleteEmployee(1);
	}
}
