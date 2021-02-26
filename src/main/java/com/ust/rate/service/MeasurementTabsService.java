package com.ust.rate.service;

import com.ust.rate.domain.entity.MeasurementTabs;
import com.ust.rate.domain.repository.MeasurementTabsRepository;
import com.ust.rate.web.model.AvailableModulesModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
@Transactional
public class MeasurementTabsService {

    private final MeasurementTabsRepository measurementTabsRepository;

    public Flux<MeasurementTabs> findAll() {
        return this.measurementTabsRepository.findAll();
    }

    public Flux<AvailableModulesModel> available() {
        return this.measurementTabsRepository.getModulesAvailables();
    }
}
