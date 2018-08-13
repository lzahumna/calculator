package com.liudmyla.zahumna.calculator.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Decided to play with Stack and implement calculator with parenthesis
 *
 * Calculator covers + - / and * with ( )
 *
 * @author lzahumna
 * @since 25/09/2016
 */
public class StackCalculator {

    public static void main(String[] args) {
//        ( ( 1 + ( 2 * ( 5 / 2 ) ) + ( 10 - 20 ) ) )
        Stack<String> operator = new Stack<>();
        Stack<Double> numbers = new Stack<>();
        Scanner reader = new Scanner(System.in);
        String[] symbols = reader.nextLine().split(" ");
        for (String symbol : symbols) {
            System.out.println();
            System.out.println("next symbol is " + symbol);
            switch (symbol) {
                case "(":
                    System.out.println("skipping...");
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    operator.push(symbol);
                    System.out.println(" operators : " + operator);
                    System.out.println(" numbers : " + numbers);
                    break;
                case ")": {
                    Double var2 = numbers.pop();
                    Double var1 = numbers.pop();
                    String op = operator.pop();
                    System.out.println("perform operation " + op);
                    switch (op) {
                        case "+":
                            numbers.push(var1 + var2);
                            System.out.println(" operators : " + operator);
                            System.out.println(" numbers : " + numbers);
                            break;
                        case "-":
                            numbers.push(var1 - var2);
                            System.out.println(" operators : " + operator);
                            System.out.println(" numbers : " + numbers);
                            break;
                        case "*":
                            numbers.push(var1 * var2);
                            System.out.println(" operators : " + operator);
                            System.out.println(" numbers : " + numbers);
                            break;
                        case "/":
                            numbers.push(var1 / var2);
                            System.out.println(" operators : " + operator);
                            System.out.println(" numbers : " + numbers);
                            break;
                    }
                    break;
                }
                default:
                    numbers.push(Double.parseDouble(symbol));
                    System.out.println(" operators : " + operator);
                    System.out.println(" numbers : " + numbers);
                    break;
            }
        }
        System.out.println("final result = " + numbers.pop());
    }
}
