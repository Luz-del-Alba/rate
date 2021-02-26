package com.ust.rate.web.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder(toBuilder = true)
public class EvaluationModel {

    private BigDecimal estimation;

    private String period;
}
