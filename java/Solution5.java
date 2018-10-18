/** Project Euler.net
* 
* PROBLEM 5:
*    2520 is the smallest number that can be divided by each of the numbers 
*    from 1 to 10 without any remainder.
*
*    What is the smallest positive number that is evenly divisible by all 
*    of the numbers from 1 to 20?
*
* ANSWER: 
*    232792560
*
* @author ndkerby
*/

import java.util.*;

public class Solution5  {

    public static final int DIVISIBLE_NUMBER = 20;
    
    public static void main(String[] args) {
        int smallestMultiple = 0;
        boolean found = false;
        do{  
            smallestMultiple+=DIVISIBLE_NUMBER;
            int count = 0;
            for(int i = 1; i <= DIVISIBLE_NUMBER; i++){
                if(smallestMultiple%i == 0){
                    count++;
                }
                if(count == DIVISIBLE_NUMBER){
                    found = true;
                } 
            }
        } while (!found);
        
        System.out.println("Smallest Multiple:" + smallestMultiple);  
    } 
}
