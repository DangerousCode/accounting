package com.ust.calc.calculadora.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

/**
 * Spanish implentation of Payroll
 */
@Service
@RequiredArgsConstructor
public class UstPayroll implements Payroll<Paysheet, Paysheet> {

    private final PaysheetCalc<Employee> employeePaysheetCalc;
    private final EmployeeRepository<String, Employee> employeeRepository;
    private final Random random = new Random();

    @Override
    public Paysheet generatePayroll(final Paysheet paysheet) {
        final Optional<Employee> employee = employeeRepository.findById(paysheet.getEmployeeId());
        if (employee.isPresent()) {
            return Paysheet.builder()
                .id(String.valueOf(random.nextInt()))
                .salary(employeePaysheetCalc.calulation(employee.get()))
                .employeeId(paysheet.getEmployeeId())
                .build();
        }

        return null;
    }

}
