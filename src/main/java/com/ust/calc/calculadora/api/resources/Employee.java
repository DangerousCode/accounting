package com.ust.calc.calculadora.api.resources;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * Representation of Employee
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String name;
    private String address;
    private String email;
    private String dni;
    private String birthDate;
    private String phoneNumber;
    private String sex;
    private String id;
    private Contract contract;

}
