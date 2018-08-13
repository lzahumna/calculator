package com.liudmyla.zahumna.calculator.simple.impl;

import com.liudmyla.zahumna.calculator.simple.OperationProcessor;

import java.util.List;

/**
 * Covers +
 *
 * @author lzahumna
 * @since 20/04/2016
 */
public class AdditionOperationProcessor implements OperationProcessor {
    @Override
    public void validate(List<Double> listValues) {

    }

    @Override
    public Double calculate(List<Double> listValues) {

        double result = 0;

        for (Double listValue : listValues) {
            result = result + listValue;
        }
        return result;
    }
}
