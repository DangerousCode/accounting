package com.ust.calc.calculadora.clients;

import org.springframework.stereotype.Service;

import com.ust.calc.calculadora.datasource.api.Data;
import com.ust.calc.calculadora.datasource.api.DataOperation;
import com.ust.calc.calculadora.datasource.api.DataOperationPortImplService;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class DataSourceWSClientUpdate {
	
	//WebServiceClient
	private final DataOperationPortImplService service;
	
	public Data dataUpdate(Data data){

        /*URL wsdlUrl = new URL("http://localhost:8080/datasource-ws/data?WSDL");
        QName qname = new QName("http://api.datasource.ust.com/", "DataOperationPortImplService");
        Service service = Service.create(wsdlUrl, qname);
        DataOperation dataOperation = service.getPort(DataOperation.class);*/
		
		DataOperation dataOperation = service.getDataOperationPortImplPort();
        
        return dataOperation.update(data);
        
    }

}
