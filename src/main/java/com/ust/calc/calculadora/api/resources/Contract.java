package com.ust.calc.calculadora.api.resources;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class Contract {

	private String category;
	private String contractType;
	private String startDate;
	private String salary;
	private String endDate;
	private String insuranceNumber;
	private String civilStatus;
	private String currentAccount;
	
}
