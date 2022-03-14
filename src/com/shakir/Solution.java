package com.shakir;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {

        for(int i =0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return false;
            }
        }
        return true;
    }

    public int sumDiagonal(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i==j) {
                    sum += a[i][j];
                }

            }


        }
        return sum;
    }


    static String firstSecond(Integer[] myArray) {
       Integer[] arr = new  Arrays.sort(myArray);
        System.out.println( );

    }

}
}