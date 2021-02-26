package com.ust.rate.web.controller;

import com.ust.rate.service.EvaluationService;
import com.ust.rate.web.model.EvaluationModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path = "/api/v1/evaluation")
public class EvaluationController {

    private final EvaluationService evaluationService;

    @PostMapping
    public EvaluationModel evaluate() {
        return evaluationService.evaluate();
    }

}
