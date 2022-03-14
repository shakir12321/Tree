package com.shakir;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.println("Enter base Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter 'exponent' the power of Number: ");
        Scanner sc2 = new Scanner(System.in);
        int pow = sc2.nextInt();
        System.out.println(power(num, pow));
    }

    private static int power(int num, int pow) {
        if(pow ==0 ) return 1;
        else return num * power(num, pow-1);

    }
}
