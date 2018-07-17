package com.ust.calc.calculadora.api.services.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

@RunWith(SpringRunner.class)
public class EmployeeDSToEmployeeConverterTest {

	@Test
    public void testConverter() {
		
		EmployeeDS input = new EmployeeDS("","","","","","","","","","","","","","","","");
		Employee output = new EmployeeDSToEmployeeConverter().convert(input);
    	assertThat(output).isNotNull();
    	assertThat(output.getName()).isEqualTo("");
    }
}
