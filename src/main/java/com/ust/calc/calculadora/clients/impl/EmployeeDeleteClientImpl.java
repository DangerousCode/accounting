package com.ust.calc.calculadora.clients.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.clients.DataSourceWSClientDelete;
import com.ust.calc.calculadora.clients.EmployeeDeleteClient;

@Component
public class EmployeeDeleteClientImpl implements EmployeeDeleteClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDeleteClientImpl.class);

	@Autowired
	private DataSourceWSClientDelete dataSourceWSClientDelete;
	
	@Override
	public void deleteEmployee(final Integer id) {
		LOGGER.info("Request for external service: {}", id);
		dataSourceWSClientDelete.employeeDSDelete(Integer.toString(id));
		LOGGER.info("Response for external service: {}", id);
	}
}
