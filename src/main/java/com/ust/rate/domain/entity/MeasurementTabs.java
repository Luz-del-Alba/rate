package com.ust.rate.domain.entity;

import com.ust.rate.domain.entity.type.ModuleType;
import com.ust.rate.domain.entity.type.Range;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@ToString
@NoArgsConstructor
@Document(collection = "measurement-tabs")
public class MeasurementTabs {

    @Id
    private String id;
    private ModuleType module;
    private Range<BigDecimal> coverage;
    private Range<Integer> age;
    private BigDecimal bonus;
    private Range<LocalDate> date;
    private BigDecimal risk;
    private BigDecimal rate;


}
