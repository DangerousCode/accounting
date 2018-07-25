package com.ust.calc.calculadora.api.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
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
		EmployeeDS outputClientCall = mock( EmployeeDS.class);
		EmployeeDS employeeUpdated = mock(EmployeeDS.class);
        when(converterEmployeeToEmployeeDS.convert(employee)).thenReturn(outputClientCall);
        when(integrationDSClientUpdate.employeeUpdate(outputClientCall)).thenReturn(employeeUpdated);
        when(converterEmployeeDSToEmployee.convert(employeeUpdated)).thenReturn(mock(Employee.class));
        Employee outputService = employeeUpdateService.updateEmployee(employee);
        verify(converterEmployeeToEmployeeDS, times(1)).convert(employee);
        verify(integrationDSClientUpdate, times(1)).employeeUpdate(outputClientCall);
        verify(converterEmployeeDSToEmployee, times(1)).convert(employeeUpdated);
        assertThat(outputService).isNotNull();
	}

}
