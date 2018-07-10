package com.ust.calc.calculadora.repository;

import com.ust.calc.calculadora.api.resources.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Jdbc Implementation
 */
@Slf4j
@Repository
@Deprecated
public class JdbcEmployeeRepository implements EmployeeRepository<String, Employee> {

    @Override
    public Optional<Employee> findById(final String id) {
        log.info("id:{}", id);
        return Optional.of(Employee.builder()
            .position(2)
            .build());
    }

}
