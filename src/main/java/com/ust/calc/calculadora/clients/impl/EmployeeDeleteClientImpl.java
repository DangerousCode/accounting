package com.ust.calc.calculadora.clients.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.clients.EmployeeDeleteClient;

@Component
public class EmployeeDeleteClientImpl implements EmployeeDeleteClient {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDeleteClientImpl.class);
	
	@Override
	public void deleteEmployee(final Integer id) {
		LOGGER.info("Request for external service: {}", id);
		//TODO => Call other service
		LOGGER.info("Response for external service: {}", id);
	}
}
