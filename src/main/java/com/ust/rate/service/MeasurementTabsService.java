package com.ust.rate.service;

import com.ust.rate.domain.entity.MeasurementTabs;
import com.ust.rate.domain.repository.MeasurementTabsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class MeasurementTabsService {

    private final MeasurementTabsRepository measurementTabsRepository;

    public Flux<MeasurementTabs> findAll() {
        return this.measurementTabsRepository.findAll();
    }

}