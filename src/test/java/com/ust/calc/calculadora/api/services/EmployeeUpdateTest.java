package com.ust.calc.calculadora.api.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.ust.calc.calculadora.services.converters.EmployeeDSToEmployeeConverter;
import com.ust.calc.calculadora.services.converters.EmployeeToEmployeeDSConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.api.services.impl.EmployeeUpdateServiceImpl;
import com.ust.calc.calculadora.clients.DataSourceWSClientUpdate;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationDSClientUpdate;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeUpdateTest {
	
	private IEmployeeUpdateService employeeUpdateService;
	
	@Mock
	private Employee employee;
	
	@Mock
	private IntegrationDSClientUpdate integrationDSClientUpdate;
	
	@Mock
	private DataSourceWSClientUpdate dataSourceWSClientUpdate;
	
	@Mock
	private EmployeeToEmployeeDSConverter converterEmployeeToEmployeeDS;
	
	@Mock
	private EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee;

	@Before
	public void SetUp() {
		employeeUpdateService = new EmployeeUpdateServiceImpl(integrationDSClientUpdate, converterEmployeeToEmployeeDS, converterEmployeeDSToEmployee);
	}
	
	@Test
	public void testEmployeeUpdate() {
		final EmployeeDS outputClientCall = new EmployeeDS();
		when(integrationDSClientUpdate.employeeUpdate(Mockito.any())).thenReturn(outputClientCall);
        when(converterEmployeeToEmployeeDS.convert(Mockito.any())).thenReturn(new EmployeeDS());
        when(converterEmployeeDSToEmployee.convert(Mockito.any())).thenReturn(new Employee());
        Employee outputService = employeeUpdateService.updateEmployee(employee);
        assertThat(outputService).isNotNull();
	}

}
