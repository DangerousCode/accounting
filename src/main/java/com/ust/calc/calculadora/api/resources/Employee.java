package com.ust.calc.calculadora.api.resources;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * Representation of Employee
 */
@Getter
@Builder
public class Employee {

    private String nombre;
    private String direccion;
    private String dni;
    private String fechaNacimiento;
    private String telefono;
    private String sexo;
    private String id;
    private Contract contract;

}
