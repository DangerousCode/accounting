package com.ust.calc.calculadora.config;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.repository.CrudRepository;
import com.ust.calc.calculadora.services.Payroll;
import com.ust.calc.calculadora.services.PayrollService;
import com.ust.calc.calculadora.services.PaysheetCalc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Configuration
public class Config {

    @Bean
    public Map<String, Employee> mapEmployeeBean() {
        return new HashMap<>();
    }

    @Bean
    public Map<String, Paysheet> mapPaysheetBean() {
        return new HashMap<>();
    }

    @Bean
    public Random randomBean() {
        return new Random();
    }

    @Bean
    public Payroll<Paysheet, Paysheet> ustPayroll(
        final PaysheetCalc<Employee> employeePaysheetCalc,
        @Qualifier("mapEmployeeRepository") final CrudRepository<Employee, String> mapEmployeeRepository,
        CrudRepository<Paysheet, String> paysheetRepository

        ) {
        return new PayrollService(
            employeePaysheetCalc,
            mapEmployeeRepository,
            paysheetRepository
        );
    }

}
