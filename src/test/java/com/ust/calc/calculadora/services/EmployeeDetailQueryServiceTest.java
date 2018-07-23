package com.ust.calc.calculadora.services;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.DataSourceWSClient;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.services.converters.EmployeeDSToEmployeeConverter;
import com.ust.calc.calculadora.services.impl.EmployeeDetailQueryServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeDetailQueryServiceTest {

    private IEmployeeDetailQueryService employeeDetailQueryService;    
    
    private @Mock
    DataSourceWSClient dataSourceClient;
    
    private @Mock 
    EmployeeDSToEmployeeConverter converterEmployeeDSToEmployee;
	
    @Before
    public void setUp() {
    	employeeDetailQueryService = new EmployeeDetailQueryServiceImpl(dataSourceClient,converterEmployeeDSToEmployee);
    }

    
//	@Override
//	public Employee getEmployeeDetailsByNIF(final String param) {		
//		return converter.convert(wsClient.getEmployeeDetailsByNIF(param));
//	}
//
//	@Override
//	public List<Employee> getEmployeeDetailsByName(final String param) {
//		List<Employee> lstReturnedEmployees = new LinkedList<Employee>();
//		for(EmployeeDS providerEmployee : wsClient.getEmployeeDetailsByName(param)) {
//			lstReturnedEmployees.add(converter.convert(providerEmployee));
//		}
//		return lstReturnedEmployees;
//	}
    
    @Test
    public void testDetailsByNIF() { 
    	final Employee outputService = new Employee();
    	when(dataSourceClient.getEmployeeDetailsByNIF(Mockito.anyString())).thenReturn(new EmployeeDS());
    	when(converterEmployeeDSToEmployee.convert(Mockito.any())).thenReturn(outputService);
    	employeeDetailQueryService.getEmployeeDetailsByNIF("83479509F");
        assertThat(outputService).isNotNull();
    }
    
    @Test
    public void testDetailsByName() {    	
    	final List<Employee> outputService = new LinkedList<Employee>();
    	@SuppressWarnings("serial")
		List<EmployeeDS> dsClientOutput = new LinkedList<EmployeeDS>() {{
    		add(new EmployeeDS());
    		add(new EmployeeDS());
    	}};
    	when(dataSourceClient.getEmployeeDetailsByName(Mockito.anyString())).thenReturn(dsClientOutput);
    	when(converterEmployeeDSToEmployee.convert(Mockito.any())).thenReturn(new Employee());
    	employeeDetailQueryService.getEmployeeDetailsByName("alotes");
        assertThat(outputService).isNotNull();
    }

}