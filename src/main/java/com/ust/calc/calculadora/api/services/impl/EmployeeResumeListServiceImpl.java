package com.ust.calc.calculadora.api.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.IEmployeeResumeListService;
import com.ust.calc.calculadora.api.services.converters.EmployeeDSToEmployeeConverter;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationResumeListDSClient;

import lombok.RequiredArgsConstructor;

@Service
//@RequiredArgsConstructor
public class EmployeeResumeListServiceImpl implements IEmployeeResumeListService {
	
	private final IntegrationResumeListDSClient integrationResumeListDSClient;
	private final EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee;
	
	public EmployeeResumeListServiceImpl(IntegrationResumeListDSClient integrationResumeListDSClient,
			EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee) {
		
		this.integrationResumeListDSClient = integrationResumeListDSClient;
		this.converterEmployeeDSToEmployee = converterEmployeeDSToEmployee;
		
	}
	
	public List<Employee> resumeListEmployee() {
		
		List<Employee> employees = new ArrayList<Employee>();
		
		List<EmployeeDS> employeesDS = integrationResumeListDSClient.resumeListEmployee();
		if(employeesDS != null) {
			for(EmployeeDS employeeDS : employeesDS) {
				Employee employee = converterEmployeeDSToEmployee.convert(employeeDS);
				employees.add(employee);
			}
		}
		
		return employees;
	}

}
