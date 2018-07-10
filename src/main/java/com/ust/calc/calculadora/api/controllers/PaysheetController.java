package com.ust.calc.calculadora.api.controllers;

import com.ust.calc.calculadora.api.resources.Paysheet;
import com.ust.calc.calculadora.services.Payroll;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.models.HttpMethod;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Api(value = "/accounting/paysheet", description = "paysheet API")
@RestController
@RequiredArgsConstructor
public class PaysheetController implements PaysheetAPI {

    private final Payroll<Paysheet, Paysheet> ustPayroll;

    @ApiOperation(value = "create a paysheet resource",
        response = Paysheet.class,
        nickname = "createInterbankContractTransfer",
        httpMethod = "POST",
        produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses({
        @ApiResponse(code=200, message="create a paysheet resource")
    })
    @PostMapping(path = "/paysheet")
    @Override
    public ResponseEntity<Paysheet> createPaysheet(final @RequestBody Paysheet paysheet) {
        return ResponseEntity.ok(ustPayroll.generatePayroll(paysheet));
    }

}
