package com.ust.calc.calculadora.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.ust.calc.calculadora.clients.DataClientWSStub;


@Configuration
public class DataClientWSConfig {

	@Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this is the package name specified in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.ust.calc.calculadora.wsdlstub");
        return marshaller;
    }
	
	@Bean
    public DataClientWSStub dataClientWS(Jaxb2Marshaller marshaller) {
		DataClientWSStub client = new DataClientWSStub();
        client.setDefaultUri("http://localhost:8080/datasource-ws/data");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
