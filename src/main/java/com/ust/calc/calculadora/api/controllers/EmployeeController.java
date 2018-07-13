package com.ust.calc.calculadora.api.controllers;

import java.net.URI;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.exception.ValidationException;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class EmployeeController implements EmployeeAPI {

	@ApiOperation(value = "create a paysheet resource", response = Paysheet.class, nickname = "createPaysheet", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses({ @ApiResponse(code = 200, message = "create a paysheet resource") })
	@Override
	@PostMapping(path = "/employee")
	public ResponseEntity<Employee> createEmployee(@RequestBody final Employee employee) {
		// return ResponseEntity.ok(Empleado.builder().build());

		validateEmployee(employee);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(1).toUri();

		return ResponseEntity.created(location).build();

		// return null;
	}

	public void validateEmployee(Employee employee) {

		// Employee and contract validation.

		if (StringUtils.isEmpty(employee.getName())) {
			throw new ValidationException("The user name is required");
		}

		else if (StringUtils.isEmpty(employee.getDni())) {
			throw new ValidationException("The user ID number is required");
		}

		else if (StringUtils.isEmpty(employee.getBirthDate())) {
			throw new ValidationException("The user date of birth is required");
		}

		else if (StringUtils.isEmpty(employee.getEmail())) {
			throw new ValidationException("The user email is required");
		}

		else if (StringUtils.isEmpty(employee.getContract().getCategory())) {
			throw new ValidationException("The contract category is required");
		}

		else if (StringUtils.isEmpty(employee.getContract().getCivilStatus())) {
			throw new ValidationException("The civil status is required");
		}

		else if (StringUtils.isEmpty(employee.getContract().getContractType())) {
			throw new ValidationException("The contract  type is required");
		}

		else if (StringUtils.isEmpty(employee.getContract().getCurrentAccount())) {
			throw new ValidationException("The contract current account is required");
		}

		else if (StringUtils.isEmpty(employee.getContract().getInsuranceNumber())) {
			throw new ValidationException("The contract insurance number is required");
		}

		else if (StringUtils.isEmpty(employee.getContract().getSalary())) {
			throw new ValidationException("The salary is required");
		}

		else if (StringUtils.isEmpty(employee.getContract().getStartDate())) {
			throw new ValidationException("The contract start date is required");
		}

	}

}
