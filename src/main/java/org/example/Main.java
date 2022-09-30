package org.example;

class myownclass {
    static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int subtractNumbers(int a, int b) {
        int subt = a - b;
        return subt;
    }

    public static int multiplyNumbers(int a, int b) {
        int mult = a * b;
        return mult;
    }

    public static int divideNumbers(int a, int b) {
        int div = a / b;
        return div;
    }

    public static int square(int num) {

        return num * num;
    }


}


public class Main {
    public static void main(String[] args) {
        System.out.println("yay");
    }
}