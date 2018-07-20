package com.ust.calc.calculadora.clients;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.services.converters.DataProviderToEmployeeDSConverter;
import com.ust.calc.calculadora.wsdlstub.FindByDniResponse;
import com.ust.calc.calculadora.wsdlstub.FindByNameResponse;

@RunWith(MockitoJUnitRunner.class)
public class DataSourceWSClientTest {
	
	
	private DataSourceWSClient dataSourceClient;	
	@Mock
	private DataClientWSStub dataClientWSStub;
	@Mock
	private DataProviderToEmployeeDSConverter converter;
	
	@Before
    public void setUp() {
		dataSourceClient = new DataSourceWSClient(dataClientWSStub,converter);
    }
	

	@Test
	public void testNIFOK() throws JsonProcessingException {
		final String testDni = "87589609F";
		final EmployeeDS employeeResult = new EmployeeDS();
		final FindByDniResponse outputData = new FindByDniResponse();
		when(dataClientWSStub.findByDni(testDni)).thenReturn(outputData);
		when(converter.convert(outputData.getReturn())).thenReturn(employeeResult);
    	dataSourceClient.getEmployeeDetailsByNIF(testDni);
    	
    	assertThat(employeeResult).isNotNull();
		
	}
	
	@Test
    public void testNameOK() throws JsonProcessingException {
		final String nameParam = "alotes";		
		final FindByNameResponse outputData = new FindByNameResponse();
		when(dataClientWSStub.findByName(nameParam)).thenReturn(outputData);
		when(converter.convert(Mockito.any())).thenReturn(new EmployeeDS());
    	
		List<EmployeeDS> employeeResult = dataSourceClient.getEmployeeDetailsByName(nameParam);
    	
    	assertThat(employeeResult).isNotNull();
		
	}

}
