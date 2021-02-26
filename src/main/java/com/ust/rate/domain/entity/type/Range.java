package com.ust.rate.domain.entity.type;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Range<T> {
    private T min;
    private T max;
    private String description;
}
