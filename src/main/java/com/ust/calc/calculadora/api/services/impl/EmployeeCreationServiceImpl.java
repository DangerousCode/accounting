package com.ust.calc.calculadora.api.services.impl;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeCreationService;
import com.ust.calc.calculadora.api.services.converters.EmployeeDSToEmployeeConverter;
import com.ust.calc.calculadora.api.services.converters.EmployeeToEmployeeDSConverter;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClient;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeCreationServiceImpl implements IEmployeeCreationService {
	
	private final IntegrationDSClient integrationDSClient;
	private final EmployeeToEmployeeDSConverter converterEmployeeToEmployeeDS;
	private final EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee;
	
	public Employee createEmployee(Employee employee) {
		
		EmployeeDS employeeDS = converterEmployeeToEmployeeDS.convert(employee);
		
		employeeDS = integrationDSClient.newEmployee(employeeDS);		
		
		return converterEmployeeDSToEmployee.convert(employeeDS);
	}

}
