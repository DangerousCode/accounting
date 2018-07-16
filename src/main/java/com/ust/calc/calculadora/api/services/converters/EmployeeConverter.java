package com.ust.calc.calculadora.api.services.converters;

import org.springframework.core.convert.converter.Converter;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

public class EmployeeConverter implements Converter<Employee, EmployeeDS> {
	

	@Override
	public EmployeeDS convert(Employee employee) {
		
		EmployeeDS employeeDS = new EmployeeDS(employee.getId(), employee.getName(), employee.getEmail(), 
				 employee.getDni(), employee.getBirthDate(), employee.getAddress(),  employee.getSex(), employee.getPhoneNumber(),
				 employee.getContract().getSalary(), employee.getContract().getCurrentAccount(), employee.getContract().getCivilStatus(), 
				 employee.getContract().getStartDate(), employee.getContract().getCategory(), employee.getContract().getContractType(), 
				 employee.getContract().getInsuranceNumber(), employee.getContract().getEndDate());
		
		return employeeDS;
	}

}
