package com.shakir;

import java.util.Scanner;

public class ToBinary {
    public static void main(String[] args) {
        System.out.println("Enter decimal number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(binary(num));
    }

    private static int binary(int num) {
        if(num/2  == 0) return 1;
        else{

            //return  binary(num/2) + " " + num%2;
            return  num%2 + 10 * binary(num/2) ;


        }


    }
}
