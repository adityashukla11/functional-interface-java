package com.practice;

import java.util.Collections;

@FunctionalInterface // It can have only one abstarct method
interface TestInterface1 {
    int addNumber(int a, int b);
    String toString();
}


public class Practice_FunctionalInterface {
    public static void main(String[] args) {
        //TestInterface1 testInterface1 = (a, b) -> a + b;
        TestInterface1 testInterface1 = Integer::sum;
        System.out.println(testInterface1.addNumber(2, 6));
    }
}
