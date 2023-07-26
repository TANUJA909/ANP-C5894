package loops;
/*
 Exercise 1:
Write a program that prompts the user to enter a series of integers.
The program should calculate the sum of all the even numbers entered, skipping any negative numbers. 
Use the continue statement to skip negative numbers. 
 */
import java.util.Scanner;

public class SeriesOfIntegers {

	public static void main(String[] args) 
	{
		// Scanner class object
		Scanner s=new Scanner(System.in);
		//input from user
		System.out.println("Enter the number of integers to sum: ");
		
		//integer input from user
		int count=s.nextInt();
		int sum=0;
		
		//input prompts the user to enter a series of integers.
		System.out.println("Enter a series of integers: ");
		
		for(int i=1;i<=count;i++)
		{
			System.out.println("Enter integers #" + i + ": ");
			int val=s.nextInt();
			
			//calculate the sum of all the even numbers entered, skipping any negative numbers using if else loop
			if(val%2==0)
			{
				if(0>=val)
				{
					// Use the continue statement to skip negative numbers. 
	                continue;
				}
				System.out.print(sum+" + "+val+" = ");
				System.out.println(sum=sum+val);
			}
			
		}
		
		System.out.println("The sum of all " + count + " numbers is: " + sum);
		
		s.close();

	}

}
