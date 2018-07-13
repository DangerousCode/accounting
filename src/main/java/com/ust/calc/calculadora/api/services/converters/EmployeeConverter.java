package com.ust.calc.calculadora.api.services.converters;

import org.springframework.core.convert.converter.Converter;

import com.ust.calc.calculadora.api.resources.Contract;
import com.ust.calc.calculadora.api.resources.Employee;
import com.ust.calc.calculadora.clients.entity.EmployeeDS;

public class EmployeeConverter implements Converter<EmployeeDS, Employee> {
	

	@Override
	public Employee convert(EmployeeDS source) {
		
		Contract contract = new Contract(source.getCategoria(), source.getTipocontrato(), source.getFecalta(), source.getSalary(), 
				                         source.getFecbaja(), source.getNsegsoc(), source.getEstadocivil(), source.getCtacte());
		
		Employee devolucion = new Employee(source.getName(), source.getDireccion(), source.getEmail(), source.getDni(), 
				source.getFecnac(), source.getNumtel(), source.getSexo(), source.getId(), contract);
		
		return devolucion;
	}

}
