package com.ust.calc.calculadora.api.controllers;

import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.services.Payroll;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PaysheetControllerTest {

    private PaysheetAPI paysheetController;

    private @Mock
    Payroll<Paysheet, Paysheet> ustPayrollService;

    private @Mock
    Paysheet paysheet;

    @Before
    public void setUp() throws Exception {
        paysheetController = new PaysheetController(ustPayrollService);
    }

    @Test
    public void createPaysheet() {
        when(ustPayrollService.generatePayroll(any(Paysheet.class))).thenReturn(paysheet);
        final ResponseEntity<Paysheet> paysheet = paysheetController.createPaysheet(Paysheet.builder().build());
        assertThat(paysheet).isNotNull();
    }

}