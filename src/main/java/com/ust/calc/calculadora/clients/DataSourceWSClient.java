package com.ust.calc.calculadora.clients;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.services.converters.DataProviderToEmployeeDSConverter;
import com.ust.calc.calculadora.wsdlstub.Data;
import com.ust.calc.calculadora.wsdlstub.FindByDniResponse;
import com.ust.calc.calculadora.wsdlstub.FindByNameResponse;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DataSourceWSClient {

	private final DataClientWSStub clientWSStub;
	private final DataProviderToEmployeeDSConverter converter;
	public EmployeeDS getEmployeeDetailsByNIF(String dni) {
		
		final FindByDniResponse findByDniResponse = clientWSStub.findByDni(dni);
		return converter.convert(findByDniResponse.getReturn());		
	}

	public List<EmployeeDS> getEmployeeDetailsByName(String name) {
		final FindByNameResponse findByNameResponse = clientWSStub.findByName(name);
		List<EmployeeDS> lstEmployees = new LinkedList<EmployeeDS>();
		for(Data dataFromList : findByNameResponse.getReturn()) {
			lstEmployees.add(converter.convert(dataFromList));
		}
		return lstEmployees;
	}

}
