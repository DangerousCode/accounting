package com.ust.calc.calculadora.api.services.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.ust.calc.calculadora.api.resources.Contract;
import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.api.services.converters.EmployeeToEmployeeDSConverter;

@RunWith(SpringRunner.class)
public class EmployeeToEmployeeDSConverterTest {

	@Test
    public void testConverter() {
		
		Employee input = new Employee("","","","",null,"","","",new Contract("", "", "","", "","","",""));
		EmployeeDS output = new EmployeeToEmployeeDSConverter().convert(input);
    	assertThat(output).isNotNull();
    	assertThat(output.getName()).isEqualTo("");
    }
}
