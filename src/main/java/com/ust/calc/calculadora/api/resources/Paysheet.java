package com.ust.calc.calculadora.api.resources;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * Representation of Paysheet
 */
@Builder
@Getter
public class Paysheet {

    private String id;
    private BigDecimal salary;
    private String EmployeeId;

}
