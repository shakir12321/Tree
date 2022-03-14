package com.shakir;

public class Factorial {
    public static void main(String[] args) {
        System.out.println( factorial(4));;
    }

    private static int factorial(int i) {

        if(i == 0) return 1;
        else {
            final int i1 = i * factorial(i - 1);
            return i1;
        }

    }
}
