package com.practice;

import java.util.function.Supplier;

public class Practice_Type_Supplier_FuncInterface {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Hello ! Welcome to Java Application";
        System.out.println(stringSupplier.get());
    }
}
