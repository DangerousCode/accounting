package com.ust.calc.calculadora.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.repository.CrudRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PayrollServiceTest {

    private Payroll<Paysheet, Paysheet> ustPayroll;

    private @Mock
    PaysheetCalc<Employee> employeePaysheetCalc;

    private @Mock
    CrudRepository<Employee, String> crudRepository;

    private @Mock
    CrudRepository<Paysheet, String>  paysheetRepository;

    private @Mock
    Paysheet paysheet;

    private @Mock
    Employee employee;

    @Before
    public void setUp() {
        ustPayroll = new PayrollService(employeePaysheetCalc, crudRepository, paysheetRepository);
    }

    @Test
    public void generatePayrollOK() {
        final Optional<Employee> optionalEmployee = Optional.of(employee);
        when(crudRepository.findById(anyString())).thenReturn(optionalEmployee);
        final Paysheet resource = ustPayroll.generatePayroll(paysheet);
        assertThat(resource).isNotNull();
    }

    @Test
    public void generatePayrollKO() {
        final Optional<Employee> optionalEmployee = Optional.empty();
        when(crudRepository.findById(anyString())).thenReturn(optionalEmployee);
        final Paysheet resource = ustPayroll.generatePayroll(paysheet);
        assertThat(resource).isNull();
    }

}