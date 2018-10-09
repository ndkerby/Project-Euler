import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

/*
A palindromic number reads the same both ways.
The task is to find the largest palindrome made from the product of two 3-digit numbers which is less than N.
To solve this problem we can just go through all 3-digits numbers and check their product is:
1. less than n
2. greater than current maximum
3. a palindrome

Note that we only check the palindorme if 1. and 2. are true.
*/
    
    public static int solution(int n) {
        int max = 0;
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                if (i*j < n && max < i * j && isPalindrome(i*j)) {
                    max = i * j;
                }
            }
        }
        return max;
    }
    
    public static boolean isPalindrome(int n) {
        String number = Integer.toString(n);
        for (int i = 0; i < Math.round(number.length()/2); i++) {
            if (number.charAt(i) != number.charAt(number.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(solution(n));
        }
    }
}
