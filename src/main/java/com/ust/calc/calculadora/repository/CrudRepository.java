package com.ust.calc.calculadora.repository;

import java.util.Optional;

/**
 * @param <ID>
 * @param <T>
 */
public interface CrudRepository<T, ID> {

    Optional<T> findById(ID id);

    <S extends T> S save(S entity);

}
