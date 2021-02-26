package com.ust.rate.web.controller;

import com.ust.rate.service.EvaluationService;
import com.ust.rate.web.model.EvaluationModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/evaluate")
public class EvaluateController {

    private final EvaluationService evaluationService;

    @GetMapping
    public EvaluationModel evaluate() {
        return evaluationService.evaluate();
    }

}
