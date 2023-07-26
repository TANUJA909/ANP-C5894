package loops;
/*Exercise :2
Write a program that prints the Fibonacci series up to a specified limit entered by the user.
However, skip printing numbers that are divisible by 3. 
Use the continue statement to skip such numbers.*/
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner s=new Scanner(System.in);
		//specified limit entered by the user for Fibonacci series
		System.out.println("Enter specified limit for Fibonacci series: ");
		
		//integer input from user
		int limit=s.nextInt();
		//Initialize the Fibonacci series variables
		int number1=0;
		int number2=1;
		int number3;
		System.out.println(number1);
		//Program that prints the Fibonacci series using for loop
		for(int i=1;i<limit;i++)
		{
			number3=number1+number2;
			number1=number2;
			number2=number3;
			
			//skip printing numbers that are divisible by 3 using if loop
			if(number1%3==0)
			{
				//Use the continue statement to skip such numbers.
				continue;
			}
			System.out.println(number1);	
		}
		s.close();
	}

}
