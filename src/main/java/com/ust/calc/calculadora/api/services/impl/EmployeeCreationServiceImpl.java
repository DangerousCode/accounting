package com.ust.calc.calculadora.api.services.impl;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeCreationService;
import com.ust.calc.calculadora.api.services.converters.EmployeeConverter;
import com.ust.calc.calculadora.clients.DataSourceClient;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClient;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmployeeCreationServiceImpl implements IEmployeeCreationService {
	
	IntegrationDSClient integrationDSClient;
	
	public EmployeeDS createEmployee(Employee employee) {
		
		final EmployeeConverter converter = new EmployeeConverter();
		EmployeeDS employeeDS = converter.convert(employee);
		
		employeeDS = integrationDSClient.newEmployee(employeeDS);
		return employeeDS;
	}

}
