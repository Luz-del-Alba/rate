package com.ust.rate.web.controller;

import com.ust.rate.service.MeasurementTabsService;
import com.ust.rate.web.model.AvailableModulesModel;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/module")
public class ModuleController {

    private final MeasurementTabsService measurementTabsService;

    @GetMapping("/available")
    public Flux<AvailableModulesModel> available() {
        return measurementTabsService.available();
    }

}
