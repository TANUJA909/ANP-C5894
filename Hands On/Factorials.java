package loops;
/*
 * Lab -1
Write a Java program that prompts the user to enter a positive integer 
and calculates its factorial using a while loop. 
The program should display the factorial as the output.
*/

import java.util.Scanner;

public class Factorials 
{
	public static void main(String[] args) 
	{
		//Scanner class to take input from the user
		Scanner s=new Scanner(System.in);
		
		// prompts the user to enter a positive integer
		System.out.println("Enter a positive integer: ");
		
		//Positive integer input from the user
		double integer=s.nextInt();
		
		//Checking whether the entered number is positive or not using if statement
		if (integer < 0) 
		{
			System.out.println("Invalid input. Please enter a positive integer.");
		}
		
		//condition
		while(integer<0)
		{
			
		}

		//factorial initialized to 1
		double factorial=1;
		
		//i initialized to 1
		double i=1;
		
		//calculates its factorial using a while loop.
		while(i<=integer)
		{
			factorial*=i;
			//i is incremented by 1
			i++;
		}
		
		//display the factorial as the output
		System.out.println("The factorial of " + integer + " is: " + factorial);
		s.close();
	}
}
