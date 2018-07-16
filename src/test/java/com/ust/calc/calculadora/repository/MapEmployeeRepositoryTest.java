package com.ust.calc.calculadora.repository;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.repository.employee.MapEmployeeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class MapEmployeeRepositoryTest {

    private CrudRepository<Employee, String> mapEmployeeRepository;

    private @Mock
    FinderComponent<Employee, String> finderEmployeeRepository;

    private @Mock
    CreatorComponent<Employee, String> mapEmployeeCreatorComponent;

    @Before
    public void setUp() throws Exception {
        mapEmployeeRepository = new MapEmployeeRepository(
            finderEmployeeRepository
            , mapEmployeeCreatorComponent
        );
    }

    @Test
    public void findById() {
    }

    @Test
    public void save() {
      //  final Employee employee = mapEmployeeRepository.save(Employee.builder().id("id").name("name").position(0).build());
       // assertThat(employee).isNotNull();
    }
}