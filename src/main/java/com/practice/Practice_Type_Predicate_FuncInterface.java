package com.practice;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Practice_Type_Predicate_FuncInterface {
    public static void main(String[] args) {

        Predicate<String> isStringLengthEven = (str) -> str.length() % 2 == 0;

        BiPredicate<String, Integer> isStringLengthGreaterThan = (str, len) -> str.length() > len;

        System.out.println(isStringLengthEven.test("Aditya"));
        System.out.println(isStringLengthEven.negate().test("Aditya"));
        System.out.println(isStringLengthGreaterThan.test("Aditya", 4));
    }
}
