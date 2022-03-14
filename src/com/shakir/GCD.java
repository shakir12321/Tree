package com.shakir;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Enter First Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter second Number: ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        System.out.println(gcd(num, num2));
    }

    private static int gcd(int num1, int num2) {
        if(num2==0 ) return num1;
        else return gcd(num2, num1%num2);

    }
}
