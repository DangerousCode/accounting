package com.ust.calc.calculadora.repository.employee;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.repository.FinderComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class MapEmployeeFinderComponent implements FinderComponent<Employee, String> {

    private final Map<String, Employee> map;

    @Override
    public Optional<Employee> findById(final String id) {
        return Optional.ofNullable(map.get(id));
    }

}
