package com.ust.calc.calculadora.api.controllers;

import com.ust.calc.calculadora.api.resources.Paysheet;
import org.springframework.http.ResponseEntity;

/**
 * API Paysheet
 */
public interface PaysheetAPI {

    ResponseEntity<Paysheet> createPaysheet(final Paysheet paysheet);

}
