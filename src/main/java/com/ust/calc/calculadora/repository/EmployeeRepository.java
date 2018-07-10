package com.ust.calc.calculadora.repository;

import java.util.Optional;

public interface EmployeeRepository<ID, T> {

    Optional<T> findById(ID id);
}
