package com.ust.calc.calculadora.api.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

public interface IEmployeeCreationService {

	Employee createEmployee(Employee employee);

}
