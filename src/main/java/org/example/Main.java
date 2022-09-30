package org.example;

class myownclass {
    static int addNumbers(int a, int b) {
        return a+b;
    }

    public static int subtractNumbers(int a, int b) {
        return a-b;
    }

    public static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    public static int divideNumbers(int a, int b) {
        return a/b;
    }

    public static int square(int num) {

        return num * num;
    }

    public static int cube(int num) {

        return num * num * num;
    }

    public static int quad(int num) {

        return num * num * num * num;
    }

    public static int fifthpower(int num) {

        return num * num * num * num * num;
    }

    public static int sixthpower(int num) {

        return num * num * num * num * num * num;
    }

    public static int printitself(int num) {

        // return statement
        return num;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("yay");
    }
}