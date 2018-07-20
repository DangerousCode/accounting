package com.ust.calc.calculadora.clients;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.datasource.api.Data;
import com.ust.calc.calculadora.datasource.api.DataOperation;
import com.ust.calc.calculadora.datasource.api.DataOperationPortImplService;
/*
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;
*/

@Service
public class DataSourceWSClientUpdate {
	
	public EmployeeDS EmployeeDSUpdate(EmployeeDS employeeDS){

        /*URL wsdlUrl = new URL("http://localhost:8080/datasource-ws/data?WSDL");
        QName qname = new QName("http://api.datasource.ust.com/", "DataOperationPortImplService");
        Service service = Service.create(wsdlUrl, qname);
        DataOperation dataOperation = service.getPort(DataOperation.class);*/
		
		//WebServiceClient
		DataOperationPortImplService service = new DataOperationPortImplService();
		
		DataOperation dataOperation = service.getDataOperationPortImplPort();
        
        Data employeeData = new Data();
        
        employeeData.setCategoria(employeeDS.getCategoria());
        employeeData.setCtacte(employeeDS.getCtacte());
        employeeData.setDireccion(employeeDS.getDireccion());
        employeeData.setDni(employeeDS.getDni());
        employeeData.setEmail(employeeDS.getEmail());
        employeeData.setEstadocivil(employeeDS.getEstadocivil());
        employeeData.setFecalta(employeeDS.getFecalta());
        employeeData.setFecbaja(employeeDS.getFecbaja());
        employeeData.setFecnac(employeeDS.getFecnac());
        employeeData.setId(employeeDS.getId());
        employeeData.setName(employeeDS.getName());
        employeeData.setNsegsoc(employeeDS.getNsegsoc());
        employeeData.setNumtel(employeeDS.getNumtel());
        employeeData.setSalary(employeeDS.getSalary());
        employeeData.setSexo(employeeDS.getSexo());
        employeeData.setTipocontrato(employeeDS.getTipocontrato());

        Data employeeResponse = dataOperation.update(employeeData);
        
        EmployeeDS employeeDSResponse = new EmployeeDS(employeeResponse.getId(), employeeResponse.getName(), employeeResponse.getEmail(), employeeResponse.getSalary(), employeeResponse.getDni(), employeeResponse.getFecnac(), employeeResponse.getDireccion(), employeeResponse.getCtacte(), employeeResponse.getEstadocivil(), employeeResponse.getSexo(), employeeResponse.getFecalta(), employeeResponse.getCategoria(), employeeResponse.getTipocontrato(), employeeResponse.getNsegsoc(), employeeResponse.getNumtel(), employeeResponse.getFecbaja());
        return employeeDSResponse;
        
    }

}
