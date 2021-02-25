package com.ust.rate.web.controller;

import com.ust.rate.domain.entity.MeasurementTabs;
import com.ust.rate.service.MeasurementTabsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/v1/measurement-tabs")
public class MeasurementTabsControllerDeleteme {

    private final MeasurementTabsService measurementTabsService;

    @GetMapping
    public Flux<MeasurementTabs> getAll() {
        return this.measurementTabsService.findAll();
    }

}
