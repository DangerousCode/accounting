package com.ust.calc.calculadora.clients;

import org.springframework.stereotype.Component;

import com.ust.calc.calculadora.datasource.api.DataOperation;
import com.ust.calc.calculadora.datasource.api.DataOperationPortImplService;

@Component
public class DataSourceWSClientDelete {

	public void employeeDSDelete(String id){
		//WebServiceClient
		DataOperationPortImplService service = new DataOperationPortImplService();
		
		DataOperation dataOperation = service.getDataOperationPortImplPort();
        
        dataOperation.delete(id);
       
    }
}
