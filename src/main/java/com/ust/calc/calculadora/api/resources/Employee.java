package com.ust.calc.calculadora.api.resources;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Representation of Employee
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@NotNull(message="The name is required")
	@Size(min = 3, message="The name must be longer")
    private String name;
	
	@Size(min = 1, max = 40, message="The name is required and can't be longer than 40 characters")
    private String address;
	
	@Pattern(regexp=".+@.+\\.[a-z]+", message="E-mail format not valid")
    private String email;
	
	@Pattern.List({
	    @Pattern(regexp = "((([X-Z])|([LM])){1}([-]?)((\\d){7})([-]?)([A-Z]{1}))|((\\d{8})([-]?)([A-Z]))", message = "Password must contain one digit."),
//	    @Pattern(regexp = "[XYZ][0-9]{7}[TRWAGMYFPDXBNJZSQVHLCKE]", message = "Password must contain one lowercase letter."),	    @Pattern(regexp = "(?=.*[A-Z])", message = "Password must contain one uppercase letter."),
	})
    private String dni;
	
	
    private Date birthDate;
    private String phoneNumber;
    private String sex;
    private String id;
    private Contract contract;

}
