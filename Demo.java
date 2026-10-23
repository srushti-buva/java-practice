
package com.tka;

public class Demo {

    // Type 1: No Argument, No Return Type
    public void myMethod() {
        System.out.println("No argument, no return");
    }

    // Type 2: Argument, No Return Type
    public void myMethod(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void myMethod(double a, double b) {
        System.out.println("Addition: " + (a + b));
    }

    public void myMethod(char ch) {
        System.out.println("Character: " + ch);
    }

    public void myMethod(boolean status) {
        System.out.println("Boolean: " + status);
    }

    public void myMethod(long number) {
        System.out.println("Long: " + number);
    }

    public void myMethod(float number) {
        System.out.println("Float: " + number);
    }

    public void myMethod(String name) {
        System.out.println("String: " + name);
    }

    public void myMethod(int number) {
        System.out.println("Integer: " + number);
    }

    public void myMethod(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public void myMethod(char a, char b) {
        System.out.println("Characters: " + a + " " + b);
    }

    public void myMethod(boolean a, boolean b) {
        System.out.println("Booleans: " + a + " " + b);
    }

    public void myMethod(float a, float b) {
        System.out.println("Float sum: " + (a + b));
    }

    public void myMethod(long a, long b) {
        System.out.println("Long sum: " + (a + b));
    }

    public void myMethod(String name, int age) {
        System.out.println(name + ": " + age);
    }

    public void myMethod(int number, char ch) {
        System.out.println("Number: " + number + ", Character: " + ch);
    }

    // Type 3 and Type 4: Methods With Return Type

    public int myMethod(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public double myMethod(double number) {
        return number * number;
    }

    public char myCharMethod() {
        return 'A';
    }

    public boolean myBooleanMethod(boolean value) {
        return !value;
    }

    public long myMethod(long a, int b, int c) {
        return a + b + c;
    }

    public float myFloatMethod(float number) {
        return number * 2;
    }

    public String myMethod(String a, String b) {
        return a + b;
    }

    public int myMethod(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public int myMethod(int a, char ch, int b) {
        return a + ch + b;
    }

    public double myMethod(double a, double b, double c) {
        return a + b + c;
    }

    // Different name because myMethod(int, int) already exists
    public boolean myCheck(int a, int b) {
        return a == b;
    }

    public long myMethod(long a, long b, long c) {
        return a + b + c;
    }

    public float myMethod(float a, float b, float c) {
        return a + b + c;
    }

    public String myMethod(char ch, int number, String text) {
        return ch + " " + number + " " + text;
    }
}
