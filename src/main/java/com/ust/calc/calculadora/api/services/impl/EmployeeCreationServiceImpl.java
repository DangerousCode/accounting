package com.ust.calc.calculadora.api.services.impl;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeCreationService;
import com.ust.calc.calculadora.api.services.converters.EmployeeConverter;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmployeeCreationServiceImpl implements IEmployeeCreationService {
	
	EmployeeCreationServiceImpl employeeCreationServiceImpl;

	
	public Employee createEmployee(Employee employee) {
		
		//mock		
		//EmployeeDS employeeDS = employeeCreationServiceImpl.createEmployee(employee);
		
		//mock
		EmployeeDS employeeDS = new EmployeeDS(
				"id", employee.getName(), "email", "salary", employee.getDni(), employee.getBirthDate(), employee.getAddress(), "ctacte",
				"estadocivil", employee.getSex(), "fecalta", "categoria", "tipocontrato", "nsegsoc", employee.getPhoneNumber(), "fecbaja"
				);
		
		final EmployeeConverter converter = new EmployeeConverter();
		final Employee salida = converter.convert(employeeDS);
		return salida;
	}

}
