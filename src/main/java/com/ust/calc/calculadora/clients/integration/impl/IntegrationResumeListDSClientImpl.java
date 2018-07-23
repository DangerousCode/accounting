package com.ust.calc.calculadora.clients.integration.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ust.calc.calculadora.clients.entity.EmployeeDS;
import com.ust.calc.calculadora.clients.integration.IntegrationResumeListDSClient;


@Service
public class IntegrationResumeListDSClientImpl implements IntegrationResumeListDSClient {
	
	private final RestTemplate restTemplate = new RestTemplate();
	
	public IntegrationResumeListDSClientImpl() {
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeDS> resumeListEmployee() {
		
		List<EmployeeDS> salida = new ArrayList<EmployeeDS>();
		
		ResponseEntity<Object> response = restTemplate.getForEntity("http://localhost:8080/data", Object.class);
		LinkedHashMap body = (LinkedHashMap)response.getBody();
		LinkedHashMap _embedded = (LinkedHashMap)body.get("_embedded");
		ArrayList data = (ArrayList)_embedded.get("data");
		
		if(data!=null) {
			for(int i=0; i<data.size();i++) {
				LinkedHashMap lhm = (LinkedHashMap)data.get(i);
				String name = (String)lhm.get("name");
				String dni = (String)lhm.get("dni");
				EmployeeDS employeeDS= new EmployeeDS("", name, "", "", dni, "", "", "", "", "", "", "", "", "", "", "");
				salida.add(employeeDS);
			}
		}
		
		return salida;
		
	}

}
