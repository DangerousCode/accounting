package com.ust.calc.calculadora.api.resources;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
