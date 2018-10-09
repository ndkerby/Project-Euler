//The sum of the squares of the first ten natural numbers is,

//12 + 22 + ... + 102 = 385
//The square of the sum of the first ten natural numbers is,

//(1 + 2 + ... + 10)2 = 552 = 3025
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

//done for 100 as well

import java.io.*;
public class Difference
{
	public static void main(String args[])
	{
		int sum1=0,sum2=0;
		for(int i=0;i<=100;i++)
		{
			sum1+=i*i;
		}
		for(int j=0;j<=100;j++)
		{
			sum2+=j;
		}
		int square=sum2*sum2;
		System.out.println("The difference is ="+(square-sum1));
	}
}
