package com.ust.calc.calculadora.repository;

import java.util.Optional;

public interface FinderComponent<T, ID> {

    Optional<T> findById(ID id);
}
