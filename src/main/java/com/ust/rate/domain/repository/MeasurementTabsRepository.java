package com.ust.rate.domain.repository;

import com.ust.rate.domain.entity.MeasurementTabs;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeasurementTabsRepository extends ReactiveMongoRepository<MeasurementTabs, String> {
}
