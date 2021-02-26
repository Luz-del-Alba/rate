package com.ust.rate.web.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/evaluation")
public class EvaluationController {

    @PostMapping
    public void save() {
    }

}
