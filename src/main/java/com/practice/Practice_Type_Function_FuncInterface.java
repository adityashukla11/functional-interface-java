package com.practice;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Practice_Type_Function_FuncInterface {

    public static void main(String[] args) {

        //Function
        Function<Integer, String> getNumInfo = (num) -> {
            if (num % 2 == 0) {
                return "Number is Even !";
            } else {
                return "Number is Odd";
            }
        };

        //BiFunction
        BiFunction<Integer, Integer, String> getSumInfo = (numA, numB) -> {
            int sum  = numA + numB;
            if (sum % 2 == 0) {
                return "Sum is Even";
            } else {
                return "Sum is Odd";
            }
        };

        //Unary Operator
        UnaryOperator<String> stringUnaryOperator = (str) -> str.substring(1);

        //Binary Operator
        BinaryOperator<String> binaryOperator = (strA, strB) -> strA.toUpperCase().concat(strB.toLowerCase());

        System.out.println(getNumInfo.apply(5));
        System.out.println(getSumInfo.apply(5,6));
        System.out.println(stringUnaryOperator.apply("Aditya"));
        System.out.println(binaryOperator.apply("Aditya", "Shukla"));
    }
}
