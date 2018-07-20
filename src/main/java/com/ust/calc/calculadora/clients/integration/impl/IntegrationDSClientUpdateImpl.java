package com.ust.calc.calculadora.clients.integration.impl;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.clients.DataSourceWSClientUpdate;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClientUpdate;


@Service
public class IntegrationDSClientUpdateImpl implements IntegrationDSClientUpdate {
	
	private final DataSourceWSClientUpdate dataSourceWSClientUpdate;
	
	public IntegrationDSClientUpdateImpl(final DataSourceWSClientUpdate dataSourceWSClient) {
		dataSourceWSClientUpdate = dataSourceWSClient;
	}

	@Override
	public EmployeeDS employeeUpdate(EmployeeDS employeeDS) {
		EmployeeDS employeeDSResponse = dataSourceWSClientUpdate.EmployeeDSUpdate(employeeDS);
		return employeeDSResponse;
	}
	
	
	

}
