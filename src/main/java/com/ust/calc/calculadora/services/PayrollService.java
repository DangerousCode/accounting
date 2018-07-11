package com.ust.calc.calculadora.services;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.repository.CrudRepository;
import lombok.RequiredArgsConstructor;

/**
 * Spanish implentation of Payroll
 */
//@Service
@RequiredArgsConstructor
public class PayrollService implements Payroll<Paysheet, Paysheet> {

    private final PaysheetCalc<Employee> employeePaysheetCalc;
    private final CrudRepository<Employee, String> employeeRepository;
    private final CrudRepository<Paysheet, String> paysheetRepository;

    @Override
    public Paysheet generatePayroll(final Paysheet paysheet) {
        //final Optional<Employee> employee = employeeRepository.findById(paysheet.getEmployeeId());

        return paysheetRepository.save(Paysheet.builder()
            .salary(employeePaysheetCalc.calulation(Employee.builder().position((int)(Math.random()*10)).build()))
            .employeeId(paysheet.getEmployeeId())
            .build());

        //if (employee.isPresent()) {

    }

    //throw new RuntimeException("resource not found");
}


