package com.ust.rate.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/v1/evaluation")
public class EvaluateController {

    @GetMapping
    public Map getAll() {
        return new HashMap();
    }

    @PostMapping
    public void save() {
    }

}
