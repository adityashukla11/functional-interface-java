package com.practice;

import java.util.Date;

interface TestInterface {
    void thisWillBeImplemented(); //Abstract
    default void show() { // Default Methods. These can be overridden by the Implementing class
        System.out.println("This is displayed through TestInterface");
    }
    static void showDate() { // Static Methods. These CANNOT be overridden by the implementing class.
        System.out.println("Today's date is: " + new Date());
    }
}

class TestClass implements TestInterface {
    @Override
    public void thisWillBeImplemented() {
        System.out.println("Called through TestClass Impl");
    }
}

public class Practice_StaticAndDefaultMethodsInterface {
    public static void main(String[] args) {
       TestClass ob = new TestClass();
       ob.thisWillBeImplemented();
       ob.show();
       TestInterface.showDate();
    }
}
