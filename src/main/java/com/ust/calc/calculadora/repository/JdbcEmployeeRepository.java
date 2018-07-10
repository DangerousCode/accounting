package com.ust.calc.calculadora.repository;

import com.ust.calc.calculadora.api.resources.Employee;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

/**
 * Jdbc Implementation
 */
@Slf4j
public class JdbcEmployeeRepository implements EmployeeRepository<String, Employee> {

    @Override
    public Optional<Employee> findById(String id) {
        log.info("id:{}", id);
        return Optional.empty();
    }
}
