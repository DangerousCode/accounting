package com.ust.calc.calculadora.services.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.wsdlstub.Data;

@Component
public class DataProviderToEmployeeDSConverter implements Converter<Data, EmployeeDS> {
	

	@Override
	public EmployeeDS convert(Data data) {
		
		EmployeeDS employeeDS = new EmployeeDS(data.getId(),data.getName(),data.getEmail(),data.getSalary(),data.getDni(),data.getFecnac(),data.getDireccion(),data.getCtacte(),data.getEstadocivil(),data.getSexo(),data.getFecalta(),data.getCategoria(),data.getTipocontrato(),data.getNsegsoc(),data.getNumtel(),data.getFecbaja());
		
		return employeeDS;
	}

}
