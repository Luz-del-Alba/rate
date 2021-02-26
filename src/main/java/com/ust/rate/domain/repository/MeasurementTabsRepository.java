package com.ust.rate.domain.repository;

import com.ust.rate.domain.entity.MeasurementTabs;
import com.ust.rate.web.model.AvailableModulesModel;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MeasurementTabsRepository extends ReactiveMongoRepository<MeasurementTabs, String> {

    @Aggregation({
            "{ $group : { _id : $module, details: { $push: $coverage } } }"
    })
    Flux<AvailableModulesModel> getModulesAvailables();
}
