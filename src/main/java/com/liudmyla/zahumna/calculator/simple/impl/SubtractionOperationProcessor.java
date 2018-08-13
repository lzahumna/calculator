package com.liudmyla.zahumna.calculator.simple.impl;

import com.liudmyla.zahumna.calculator.simple.OperationProcessor;

import java.util.List;


/**
 * Covers -
 *
 * @author lzahumna
 * @since 20/04/2016
 */
public class SubtractionOperationProcessor implements OperationProcessor {
    @Override
    public void validate(List<Double> listValues) {
    }

    @Override
    public Double calculate(List<Double> listValues) {
        double result = listValues.get(0);
        for (int i = 1; i < listValues.size(); i++) {
            result = result - listValues.get(i);
        }
        return result;
    }
}
