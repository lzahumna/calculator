package com.liudmyla.zahumna.calculator.simple.impl;

import com.liudmyla.zahumna.calculator.simple.OperationProcessor;

import java.util.List;

/**
 * Covers exp
 *
 * @author lzahumna
 * @since 20/04/2016
 */
public class ExponentiationOperationProcessor implements OperationProcessor {
    @Override
    public void validate(List<Double> listValues) {
    }

    @Override
    public Double calculate(List<Double> listValues) {
        return Math.exp(listValues.get(0));
    }
}
