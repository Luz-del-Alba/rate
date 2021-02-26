package com.ust.rate.migration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.ust.rate.domain.entity.MeasurementTabs;
import com.ust.rate.domain.repository.MeasurementTabsRepository;
import com.ust.rate.utils.Utils;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@AllArgsConstructor
public class DatabaseChangeLog implements CommandLineRunner {

    private final MeasurementTabsRepository measurementTabsRepository;

    @Override
    public void run(String... args) throws Exception {
        initDatabase();
    }

    @SneakyThrows
    public void initDatabase() {
        log.info("Initializing database.");
        if (measurementTabsRepository.count().blockOptional().orElse(0L) == 0L) {
            InputStream inputStream = getClass().getResourceAsStream("/data/measurement-tabs.json");
            String list = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8)).lines()
                    .collect(Collectors.joining("\n"));
            val initialData = Utils.objectMapper().readValue(list, new ListMeasurementTabsTypeReference());
            Flux.fromStream(
                    initialData.stream()
                            .map(measurementTabsRepository::insert)
            ).subscribe(m -> log.info("New quote loaded: {}", m.block()));
            log.info("Repository contains now {} entries.",
                    measurementTabsRepository.count().block());
        }
        log.info("Database initialized successfully.");
    }

    private static class ListMeasurementTabsTypeReference extends TypeReference<List<MeasurementTabs>> {
    }


}