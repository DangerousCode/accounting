package com.ust.calc.calculadora.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;

@FeignClient(name="${feign.client.name}", url="${feign.client.url}")
public interface DataSourceClient {

	@RequestMapping(method = RequestMethod.POST, consumes="application/json",produces="application/json")
	public ResponseEntity<EmployeeDS> newEmployee(final @RequestBody EmployeeDS employeeDS);
	
}
