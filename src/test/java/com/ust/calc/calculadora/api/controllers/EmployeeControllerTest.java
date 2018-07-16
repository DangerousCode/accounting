package com.ust.calc.calculadora.api.controllers;

import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.resources.Contract;
import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeCreationService;
import com.ust.calc.calculadora.exception.ValidationException;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {

	private EmployeeController employeeController;
	
	@Mock
	private IEmployeeCreationService service;
	
	@Before
//	public void setUp() {
//		employeeController = new EmployeeController(service);
//	}
	
	@Test
	public void callRestOk() {
		
		Employee employee = new Employee(); 
		employee.setName("a");
		employee.setDni("a");
		employee.setBirthDate(new Date());
		employee.setEmail("a");
		
		Contract contract = new Contract();
		contract.setCategory("a");
		contract.setCivilStatus("a");
		contract.setContractType("a");
		contract.setCurrentAccount("a");
		contract.setInsuranceNumber("a");
		contract.setSalary("a");
		contract.setStartDate("a");
		employee.setContract(contract);
		
		Employee employeeResult = new Employee();
		Mockito.when(service.createEmployee(Mockito.any(Employee.class))).thenReturn(employeeResult);
		
		employeeController.createEmployee(employee);
		assertNotNull(employeeResult);
	}
	
	@Test(expected = ValidationException.class)
	public void mandatoryName() {
		
		Employee employee = new Employee(); 
		employee.setName(null);
		employee.setDni("a");
		employee.setBirthDate(new Date());
		employee.setEmail("a");
		
		Contract contract = new Contract();
		contract.setCategory("a");
		contract.setCivilStatus("a");
		contract.setContractType("a");
		contract.setCurrentAccount("a");
		contract.setInsuranceNumber("a");
		contract.setSalary("a");
		contract.setStartDate("a");
		employee.setContract(contract);
		
		Employee employeeResult = new Employee();
		Mockito.when(service.createEmployee(Mockito.any(Employee.class))).thenReturn(employeeResult);
		
		employeeController.createEmployee(employee);
		
	}
}
