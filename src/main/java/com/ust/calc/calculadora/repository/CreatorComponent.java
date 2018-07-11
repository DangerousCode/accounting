package com.ust.calc.calculadora.repository;

public interface CreatorComponent<T, ID> {

    <S extends T> S save(S entity);

}
