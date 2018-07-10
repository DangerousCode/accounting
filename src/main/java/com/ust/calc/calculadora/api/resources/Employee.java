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

    private String name;
    private String id;
    private Integer position;
    private List<Paysheet> paysheets;

}
