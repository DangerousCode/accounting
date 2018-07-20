package com.ust.calc.calculadora.clients;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.ust.calc.calculadora.wsdlstub.FindByDni;
import com.ust.calc.calculadora.wsdlstub.FindByDniResponse;
import com.ust.calc.calculadora.wsdlstub.FindByName;
import com.ust.calc.calculadora.wsdlstub.FindByNameResponse;
import com.ust.calc.calculadora.wsdlstub.ObjectFactory;

public class DataClientWSStub extends WebServiceGatewaySupport {

	private static final ObjectFactory WS_CLIENT_FACTORY = new ObjectFactory();
	
	public FindByDniResponse findByDni(String param) {
		final FindByDni request = new FindByDni();
		request.setDni(param);		
		@SuppressWarnings("unchecked")
		JAXBElement<FindByDniResponse> proxyOutput = (JAXBElement<FindByDniResponse>) getWebServiceTemplate().marshalSendAndReceive(WS_CLIENT_FACTORY.createFindByDni(request));
		return proxyOutput.getValue();
	}
	
	public FindByNameResponse findByName(String param) {
		final FindByName request = new FindByName();
		request.setName(param);
		@SuppressWarnings("unchecked")
		JAXBElement<FindByNameResponse> proxyOutput = (JAXBElement<FindByNameResponse>) getWebServiceTemplate().marshalSendAndReceive(WS_CLIENT_FACTORY.createFindByName(request));
		return proxyOutput.getValue();
	}
}
