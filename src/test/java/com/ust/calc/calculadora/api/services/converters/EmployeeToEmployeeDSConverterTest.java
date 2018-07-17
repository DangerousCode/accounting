package com.ust.calc.calculadora.api.services.converters;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.ust.calc.calculadora.api.resources.Contract;
import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
com.ust.calc.calculadora.api.services.converters.EmployeeConverter;

@RunWith(SpringRunner.class)
public class EmployeeConverterTest {

	@Test
    public void testConverter() {
		
		Employee input = new Employee("","","","",null,"","","",new Contract("", "", "","", "","","",""));
		EmployeeDS output = new EmployeeConverter().convert(input);
    	assertThat(output).isNotNull();
    	assertThat(output.getName()).isEqualTo("");
    }
}
