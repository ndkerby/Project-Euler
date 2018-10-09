import java.util.*;

/**
 *
 * Project Euler #6: Sum square difference
 *
 * Find the absolute difference between the sum of the squares of the first  natural numbers and the square of the sum.
 *
 **/
public class Solution6
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int numCases = scanner.nextInt();
		double value;

		for (int i = 0; i < numCases; i++)
		{
			value = scanner.nextInt();
			System.out.println(Double.toString(calculateSumSquareDifference(value)));
		}
	}

	private static double calculateSumSquareDifference(double value)
	{
		double sumOfSquares = calculateSumOfSquares(value);
		double squareOfSum = calculateSquareOfSum(value);
		return squareOfSum - sumOfSquares;
	}

	private static double calculateSumOfSquares(double value)
	{
		int sumOfSquares = 0;
		for (int i = 1; i <= value; i++) { sumOfSquares += i*i; }
		return sumOfSquares;
	}

	private static double calculateSquareOfSum(double value)
	{
		int sum = 0;
		for (int i = 1; i <= value; i++) { sum += i; }
		return sum * sum;
	}
}
