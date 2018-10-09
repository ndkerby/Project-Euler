public class Solution4 {

    public static void main(String[] args){
        int largestPalindrome = 0;
        //Here we're searching the products of 2 3-digit numbers a and b.
        //3 digit numbers have the range 100 to 999.
        //If applied to absolutely massive numbers, might be a good idea to calc things in priority (not 9999999*1 in first loop)
        for(int a = 999; a>=100; a--){
            // b=a instead of 100, ~halves the amount of operations by not doing both 1*2 and 2*1, but starting at 2*2.
            //Operations go from 810000 to 405450. Not sure where the 450 come from.
            for(int b = a; b>=100; b--){
                if(isPalindrome(a*b) && a*b>largestPalindrome){
                    largestPalindrome = a*b;
                }
            }
        }
        System.out.println(largestPalindrome);
    }
    
    static boolean isPalindrome(int number){
        return number == reverseInt(number);
    }

    static int reverseInt(int x){
        int reversed = 0;
        while(x>0){
            //Value of reversed is moved 1 digit to the left
            //The rightmost digit of X is added (117%10 = 7) //In base 12 it would be %12 etc.
            reversed = 10*reversed + x%10;

            //x is an integer. 159/10 = 15. Removes the rightmost digit. // It would be /12 in base 12.
            x = x/10;
        }
        return reversed;
    }
}
