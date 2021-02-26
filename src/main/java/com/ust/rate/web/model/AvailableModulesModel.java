package com.ust.rate.web.model;

import com.ust.rate.domain.entity.type.Range;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AvailableModulesModel {
    private String module;
    private Range<BigDecimal> coverages;
}
