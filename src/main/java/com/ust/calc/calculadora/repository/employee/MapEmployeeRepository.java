package com.ust.calc.calculadora.repository.employee;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.repository.CreatorComponent;
import com.ust.calc.calculadora.repository.CrudRepository;
import com.ust.calc.calculadora.repository.FinderComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 */
@Repository
@RequiredArgsConstructor
public class MapEmployeeRepository implements CrudRepository<Employee, String> {

    private final FinderComponent<Employee, String> finderEmployeeRepository;
    private final CreatorComponent<Employee, String> mapEmployeeCreatorComponent;

    @Override
    public Optional<Employee> findById(final String id) {
        return finderEmployeeRepository.findById(id);
    }

    @Override
    public <S extends Employee> S save(final S employee) {
        return mapEmployeeCreatorComponent.save(employee);
    }

}
