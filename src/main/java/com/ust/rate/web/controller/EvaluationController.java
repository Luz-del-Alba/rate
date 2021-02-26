package com.ust.rate.web.controller;

import com.ust.rate.service.EvaluationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/evaluation")
public class EvaluationController {

    private final EvaluationService evaluationService;

    @PostMapping
    public BigDecimal evaluate() {
        return evaluationService.evaluate();
    }

}
