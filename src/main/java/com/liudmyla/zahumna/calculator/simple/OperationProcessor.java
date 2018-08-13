package com.liudmyla.zahumna.calculator.simple;

import java.util.List;

/**
 * Define common operations for each arithmetic operation processor.
 * Some of them require validation before calculating, others don't
 *
 * @author lzahumna
 * @since 19/04/2016
 */
public interface OperationProcessor {

    void validate(List<Double> listValues);

    Double calculate(List<Double> listValues);

}
