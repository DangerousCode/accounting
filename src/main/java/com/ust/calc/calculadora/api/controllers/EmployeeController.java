package com.ust.calc.calculadora.api.controllers;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.resources.Paysheet;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController implements EmployeeAPI {

    @ApiOperation(value = "create a paysheet resource",
        response = Paysheet.class,
        nickname = "createPaysheet",
        httpMethod = "POST",
        produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses({
        @ApiResponse(code = 200, message = "create a paysheet resource")
    })
    @Override
    @PostMapping(path = "/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody final Employee employee) {
        return ResponseEntity.ok(Employee.builder().build());
    }

}
