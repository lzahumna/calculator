package com.liudmyla.zahumna.calculator.simple;

import com.liudmyla.zahumna.calculator.simple.impl.*;

import java.util.*;

/**
 * Entry point to quickly check all the implemented operations
 *
 * @author lzahumna
 * @since 19/04/2016
 */
public class EntryPoint {

    private static final Map<String, OperationProcessor> operationName2Processor = new HashMap<String, OperationProcessor>();

    static {
        operationName2Processor.put("add", new AdditionOperationProcessor());
        operationName2Processor.put("sub", new SubtractionOperationProcessor());
        operationName2Processor.put("mul", new MultiplicationOperationProcessor());
        operationName2Processor.put("div", new DivisionOperationProcessor());
        operationName2Processor.put("log", new LogarithmOperationProcessor());
        operationName2Processor.put("exp", new ExponentiationOperationProcessor());
        operationName2Processor.put("pow", new PowerOperationProcessor());
    }

    public static void main(String args[]) {

        printAvailableOperations();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter math operation:");
        String mathFunction = input.next();

        System.out.println(mathFunction);

        if (!operationName2Processor.containsKey(mathFunction)) {
            throw new RuntimeException("Operation does not exist!");
        }

        System.out.println("Please enter numbers:");
        List<Double> numbers = new ArrayList<>();
        while (input.hasNextDouble()) {
            numbers.add(input.nextDouble());
        }

        System.out.println(numbers);

        operationName2Processor.get(mathFunction).validate(numbers);
        Double result = operationName2Processor.get(mathFunction).calculate(numbers);

        System.out.println("Result of calculation is " + result);

    }

    private static void printAvailableOperations() {
        System.out.println("Available math operations:");
        String availableOperations = " | ";

        for (String key : operationName2Processor.keySet()) {
            availableOperations += key + " | ";
        }

        System.out.println(availableOperations);
    }
}
