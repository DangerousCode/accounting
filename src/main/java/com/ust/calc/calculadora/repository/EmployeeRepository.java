package com.ust.calc.calculadora.repository;

import java.util.Optional;

@Deprecated
public interface EmployeeRepository<ID, T> {

    Optional<T> findById(ID id);

}
