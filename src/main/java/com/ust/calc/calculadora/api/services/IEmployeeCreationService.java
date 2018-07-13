package com.ust.calc.calculadora.api.services;

import java.math.BigDecimal;

import com.ust.calc.calculadora.api.resources.Employee;

public interface IEmployeeCreationService {

	BigDecimal createEmployee(Employee employee);

}
