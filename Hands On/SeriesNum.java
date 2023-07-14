package loops;
/*
Write a Java program that asks the user to enter a series of numbers (positive or negative) 
and calculates their sum. 
The program should stop asking for input when the user enters 0.
 Use a do-while loop to continuously ask for numbers and keep adding them to the sum
*/

import java.util.Scanner;

public class SeriesNum {

	public static void main(String[] args)
	{
		//scanner class object
		Scanner sc = new Scanner(System.in);
		
		//variable declaration
		int number;
		int sum=0;
		
		//do loop
		do
		{
			System.out.println("Enter a series of numbers (positive or negative): ");
			//user input
			number = sc.nextInt();
			
			//calculates their sum
			System.out.print(sum+" + "+number+" = ");
			System.out.println(sum=sum+number);
			
		}
		//Test expression
		while (number!= 0);
		
		System.out.println("The sum of all number is: "+sum);
		sc.close();
	}

}
