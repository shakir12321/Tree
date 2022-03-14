package com.shakir;

import java.util.Scanner;

public class SumOfDigitis {
    public static void main(String[] args) {
        System.out.println("Enter the digit : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(digits(num));
    }

    private static int digits(int num) {
        if(num <= 0) return 0;
        return num%10 + digits(num/10);

    }

}
