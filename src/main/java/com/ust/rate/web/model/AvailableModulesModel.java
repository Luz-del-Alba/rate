package com.ust.rate.web.model;

import com.ust.rate.domain.entity.type.Range;
import lombok.Data;

@Data
public class AvailableModulesModel {
    private String _id;
    private Range<String> details;
}
