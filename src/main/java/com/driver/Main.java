// Task 1: Create class A with method `meth`
class A {
    // Method in class A
    String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create class B which extends class A
class B extends A {
    // Task 4: Override method `meth` in class B
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method `meth` of class A
        B objB = new B();
        // No need to print the result from Task 3

        // Task 5: Call the overridden method `meth` from obj of class B
        objB.meth();
        // No need to print the result from Task 5
    }
}
