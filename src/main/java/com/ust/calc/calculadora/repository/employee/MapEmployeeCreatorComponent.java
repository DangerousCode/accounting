package com.ust.calc.calculadora.repository.employee;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.repository.CreatorComponent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class MapEmployeeCreatorComponent implements CreatorComponent<Employee, String> {

    private final Map<String, Employee> map;
    private final Random random;

    @Override
    public <S extends Employee> S save(S employee) {
        final String id = String.valueOf(Math.abs(random.nextInt()));
        final Employee employeeSaved = Employee.builder().position(employee.getPosition()).id(id).name(employee.getName()).build();
        map.put(id, employeeSaved);
        return (S) employeeSaved;
    }
}
