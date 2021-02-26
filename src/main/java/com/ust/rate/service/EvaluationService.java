package com.ust.rate.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class EvaluationService {

    public BigDecimal evaluate() {
        return new BigDecimal("0.00");
    }

}
