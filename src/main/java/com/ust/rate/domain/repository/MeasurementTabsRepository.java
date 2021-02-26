package com.ust.rate.domain.repository;

import com.ust.rate.domain.entity.MeasurementTabs;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.Map;

@Repository
public interface MeasurementTabsRepository extends ReactiveMongoRepository<MeasurementTabs, String> {

    @Aggregation({
            "{ $group : { _id : $module, modules: { $push: $coverage } } }"
    })
    Flux<Map> getModulesAvailables();
}
