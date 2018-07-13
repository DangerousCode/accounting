package com.ust.calc.calculadora.api.services.impl;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeCreationService;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmployeeCreationServiceImpl implements IEmployeeCreationService {

	@Override
	public EmployeeDS createEmployee(Employee employee) {
		return null;
	}

}
