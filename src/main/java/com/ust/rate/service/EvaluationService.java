package com.ust.rate.service;

import com.ust.rate.web.model.EvaluationModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

@Service
@AllArgsConstructor
public class EvaluationService {

    public EvaluationModel evaluate() {
        Random rand = new Random();
        var estimation = new BigDecimal(Double.toString(rand.nextDouble() * 100000));
        estimation = estimation.setScale(2, RoundingMode.HALF_UP);
        return EvaluationModel.builder()
                .estimation(estimation)
                .period("day")
                .build();
    }

}
