package com.ust.rate.domain.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collation = "measurement-tabs")
@ToString
public class MeasurementTabs {

    @Id
    private String id;
    private String module;

}
