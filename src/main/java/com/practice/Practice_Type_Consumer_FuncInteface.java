package com.practice;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.LongToDoubleFunction;

public class Practice_Type_Consumer_FuncInteface {
    public static void main(String[] args) {
        int a = 5;
        Consumer<String> sayHelloConsumer = (name) -> System.out.println("Hello : " + name);
        BiConsumer<String, String> sayHelloFullName = (firstName, lastName) -> System.out.println("Hello " + firstName +
                " " + lastName);
        sayHelloConsumer.accept("Aditya");
        sayHelloFullName.accept("Aditya", "Shukla");
    }
}
