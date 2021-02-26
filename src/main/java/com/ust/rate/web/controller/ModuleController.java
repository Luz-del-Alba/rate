package com.ust.rate.web.controller;

import com.ust.rate.service.MeasurementTabsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/module")
public class ModuleController {

    private final MeasurementTabsService measurementTabsService;

    @GetMapping("/available")
    public Flux<Map> available() {
        return measurementTabsService.available();
    }

}
