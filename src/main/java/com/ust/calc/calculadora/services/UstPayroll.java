package com.ust.calc.calculadora.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

/**
 * Spanish implentation of Payroll
 */
@RequiredArgsConstructor
public class UstPayroll implements Payroll<Paysheet, Paysheet> {

    private final PaysheetCalc<Employee> employeePaysheetCalc;
    private final EmployeeRepository<String, Employee> employeeRepository;

    @Override
    public Paysheet generatePayroll(final Paysheet paysheet) {
        final Optional<Employee> employee = employeeRepository.findById(paysheet.getEmployeeId());
        if (employee.isPresent()) {
            return Paysheet.builder()
                .salary(employeePaysheetCalc.calulation(employee.get()))
                .build();
        }

        return null;
    }

}
