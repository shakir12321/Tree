package com.shakir;

public class Reverse {

    public static void main(String[] args) {
        String s = "tococot";
        int i = 0;

        System.out.println(reverse(s));

        System.out.println(isPalindrome(s));
         }

        public static String reverse(String str)
        {
             if (0== str.length()) return str;
            return (reverse(str.substring(1))+str.charAt(0));

        }

    public  static boolean isPalindrome(String str)
    {
        if (0== str.length() || 1== str.length()) return true;

        if(str.charAt(str.length() - 1) == str.charAt(0))
            return isPalindrome(str.substring(1,str.length()-1));
        else
            return false;
    }

    public boolean someRecursive(int[] arr, OddFunction odd) {
        // TODO
        // if(arr.length == 1) return  arr[0]%2 !=0;
        //if (arr[arr.length-1]% 2 != 0) return someRecursive(arr[0, arr.length-2]);
        return true;

        //}
    }
    }

