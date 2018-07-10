package com.ust.calc.calculadora.api.resources;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Representation of Paysheet
 */
@ApiModel(value = "paysheet resource")
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Paysheet {

    @ApiModelProperty(value = "id", hidden = true)
    private String id;

    @ApiModelProperty(value = "salary", hidden = true)
    private BigDecimal salary;

    @ApiModelProperty(value = "employeeId", example = "6")
    private String employeeId;

}
