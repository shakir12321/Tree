package com.shakir;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,11,12};
        missingNumber(arr);

    }

         public static void missingNumber(int[] intArray) {
             int missing = Integer.MIN_VALUE;
                int sum = 0;
             for (int i = 0; i < intArray.length ; i++) {
                 sum = sum + intArray[i];
                  }
             System.out.println(sum);

                int sum2 = 0;
             System.out.println(intArray.length);
                sum2 = (12 * 13)/2;

             System.out.println(sum2);

             System.out.println(sum2-sum);


         }


   }
