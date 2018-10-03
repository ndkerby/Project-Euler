import java.io.*;
public class Difference
{
	public static void main(String args[])
	{
		int sum1=0,sum2=0;
		for(int i=0;i<=10;i++)
		{
			sum1+=i*i;
		}
		for(int j=0;j<=10;j++)
		{
			sum2+=j;
		}
		int square=sum2*sum2;
		System.out.println("The difference is ="+(square-sum1));
	}
}