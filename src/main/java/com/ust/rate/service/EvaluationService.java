package com.ust.rate.service;

import com.ust.rate.web.model.EvaluationModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Random;

@Service
@AllArgsConstructor
public class EvaluationService {

    public EvaluationModel evaluate() {
        Random rand = new Random();
        return EvaluationModel.builder()
                .estimation(BigDecimal.valueOf(rand.nextDouble()))
                .period("day")
                .build();
    }

}
