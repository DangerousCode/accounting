package com.ust.calc.calculadora.services;

import java.math.BigDecimal;

/**
 * Calculate the  Paysheet amount
 *
 * @param <I>
 */
public interface PaysheetCalc<I> {

    BigDecimal calulation(I input);
}
