package com.liudmyla.zahumna.calculator.simple.impl;

import com.liudmyla.zahumna.calculator.simple.OperationProcessor;

import java.util.List;

/**
 * Covers log
 *
 * @author lzahumna
 * @since 21/04/2016
 */
public class LogarithmOperationProcessor implements OperationProcessor {

    @Override
    public void validate(List<Double> listValues) {
        if (listValues.get(0) <= 0) {
            throw new RuntimeException("Number should be only >= 0");
        }
    }

    @Override
    public Double calculate(List<Double> listValues) {
        return Math.log(listValues.get(0));
    }
}
