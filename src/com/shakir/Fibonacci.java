package com.shakir;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Enter number:  ");
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            i = sc.nextInt();
        }
        System.out.println(fibo(i));
    }

    private static int fibo(int i) {
        if(i<=-1) return -1;
        if(i == 0) return 0;
        if(i == 1) return 1;
        else return fibo(i-1) + fibo(i-2);

    }


}
