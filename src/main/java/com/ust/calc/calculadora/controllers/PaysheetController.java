package com.ust.calc.calculadora.controllers;

import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.services.Payroll;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/accounting")
public class PaysheetController implements PaysheetAPI {

    private final Payroll<Paysheet, Paysheet> ustPayroll;

    @PostMapping(path = "/paysheet")
    @Override
    public Paysheet createPaysheet(final @RequestBody Paysheet paysheet) {
        return ustPayroll.generatePayroll(paysheet);
    }
}
