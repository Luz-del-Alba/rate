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
        InputStream inputStream = getClass().getResourceAsStream("/data/measurement-tabs.json");
        String list = new BufferedReader(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8)).lines()
                .collect(Collectors.joining("\n"));
        val initialData = Utils.objectMapper().readValue(list, new ListMeasurementTabsTypeReference());
        val response = measurementTabsRepository.insert(initialData);
        log.info(String.format("%s records updated.", response.count()));
        log.info("Database initialized successfully.");
    }

    private static class ListMeasurementTabsTypeReference extends TypeReference<List<MeasurementTabs>> {
    }


}