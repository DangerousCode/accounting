package com.ust.calc.calculadora.api.controllers;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.resources.Paysheet;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController implements EmployeeAPI {

	@ApiOperation(value = "create a paysheet resource", response = Paysheet.class, nickname = "createPaysheet", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({ @ApiResponse(code = 200, message = "create a paysheet resource") })
	@Override
	@PostMapping(path = "/employee")
	public ResponseEntity<Employee> createEmployee(@RequestBody final Employee employee) {
		// return ResponseEntity.ok(Empleado.builder().build());
		return null;
	}

	public void validateEmployee(Employee employee) throws Exception {

		
		//Employee and contract validation.
		
		if (StringUtils.isEmpty(employee.getName())) {
			throw new Exception("The user name is required");
		}

		else if (StringUtils.isEmpty(employee.getDni())) {
			throw new Exception("The user ID number is required");
		}

		else if (StringUtils.isEmpty(employee.getBirthDate())) {
			throw new Exception("The user date of birth is required");
		}

		else if (StringUtils.isEmpty(employee.getEmail())) {
			throw new Exception("The user email is required");
		}

		else if (StringUtils.isEmpty(employee.getContract().getCategory())) {
			throw new Exception("The contract category is required");
		}

		else if (StringUtils.isEmpty(employee.getContract().getCivilStatus())) {
			throw new Exception("The civil status is required");
		}
		
		else if (StringUtils.isEmpty(employee.getContract().getContractType())) {
			throw new Exception("The contract  type is required");
		}
		
		else if (StringUtils.isEmpty(employee.getContract().getCurrentAccount())) {
			throw new Exception("The contract current account is required");
		}
		
		else if (StringUtils.isEmpty(employee.getContract().getInsuranceNumber())) {
			throw new Exception("The contract insurance number is required");
		}
		
		else if (StringUtils.isEmpty(employee.getContract().getSalary())) {
			throw new Exception("The salary is required");
		}
		
		else if (StringUtils.isEmpty(employee.getContract().getStartDate())) {
			throw new Exception("The contract start date is required");
		}

	}

}
