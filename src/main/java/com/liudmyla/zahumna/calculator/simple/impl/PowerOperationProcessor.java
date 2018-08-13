package com.liudmyla.zahumna.calculator.simple.impl;

import com.liudmyla.zahumna.calculator.simple.OperationProcessor;

import java.util.List;

/**
 * Covers power
 *
 * @author lzahumna
 * @since 21/04/2016
 */
public class PowerOperationProcessor implements OperationProcessor {
    @Override
    public void validate(List<Double> listValues) {

    }

    @Override
    public Double calculate(List<Double> listValues) {
        return Math.pow(listValues.get(0), listValues.get(1));
    }
}
