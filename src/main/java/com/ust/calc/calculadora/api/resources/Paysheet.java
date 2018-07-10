package com.ust.calc.calculadora.api.resources;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Representation of Paysheet
 */
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Paysheet {

    private String id;
    private BigDecimal salary;
    private String employeeId;

}
