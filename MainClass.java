package com.tka;

public class MainClass {

    public static void main(String[] args) {

        Demo d = new Demo();

        // Type 1: No Argument, No Return
        d.myMethod();

        // Type 2: Argument, No Return
        d.myMethod(10, 20);
        d.myMethod(10.5, 5.5);
        d.myMethod('A');
        d.myMethod(true);
        d.myMethod(100L);
        d.myMethod(2.5f);
        d.myMethod("Java");
        d.myMethod(5);
        d.myMethod(1, 2, 3);
        d.myMethod('A', 'B');
        d.myMethod(true, false);
        d.myMethod(2.0f, 3.0f);
        d.myMethod(10L, 20L);
        d.myMethod("Age", 22);
        d.myMethod(10, 'B');

        // Type 3: No Argument, With Return
        System.out.println(d.myCharMethod());

        // Type 4: Argument, With Return
        System.out.println(d.myMethod(1, 2, 3, 4));
        System.out.println(d.myMethod(10.0));
        System.out.println(d.myBooleanMethod(false));
        System.out.println(d.myMethod(100L, 2, 3));
        System.out.println(d.myFloatMethod(8.0f));
        System.out.println(d.myMethod("Core ", "Java"));
        System.out.println(d.myMethod(1, 2, 3, 4, 5));
        System.out.println(d.myMethod(10, 'A', 20));
        System.out.println(d.myMethod(1.5, 2.5, 3.5));

        // Different method name to avoid duplicate signature
        System.out.println(d.myCheck(10, 10));

        System.out.println(d.myMethod(2L, 3L, 4L));
        System.out.println(d.myMethod(1.0f, 2.0f, 3.0f));
        System.out.println(d.myMethod('A', 22, "Java"));
    }
}



