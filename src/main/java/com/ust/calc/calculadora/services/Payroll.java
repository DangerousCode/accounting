package com.ust.calc.calculadora.services;

/**
 * Payroll generatePayroll
 *
 * @author charly
 */
public interface Payroll<I, O> {

    O generatePayroll(I request);

}

