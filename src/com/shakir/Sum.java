package com.shakir;

public class Sum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int sum = 22;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((nums[i] + nums[j]) == sum) {
                    System.out.println(nums[i] + " " + nums[j]);
                    return ;
                }

            }
            
        }
    }
}
