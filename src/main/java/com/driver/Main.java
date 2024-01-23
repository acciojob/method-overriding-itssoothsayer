package com.driver;
// Task 1: Create class A with method `meth`
// Task 1: Create class A with method `meth`


public class Main {

    public static class A {
        // Method in class A
        String meth() {
            return "Invoking method from class A";
        }
    }

    // Task 2: Create class B which extends class A
    public static class B extends A {
        // Task 4: Override method `meth` in class B
        @Override
        String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method `meth` of class A
        B objB = new B();
        String resultFromA = objB.meth();


        // Task 5: Call the overridden method `meth` from obj of class B
        String resultFromB = objB.meth();

    }
}
