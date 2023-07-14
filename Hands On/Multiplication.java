package loops;

/*
Lab-2
Write a Java program that prompts the user to enter a number
and then prints the multiplication table of that number using a for loop. 
The table should display multiplication from 1 to 10.
*/

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args)
	{
		//Scanner class to take input from the user
		Scanner s=new Scanner(System.in);
		
		//prompts the user to enter a number
		System.out.println("Enter a Number: ");
	
		//Number input from the user
		int number=s.nextInt();
		
		//prints the multiplication table
		System.out.println("Multiplication Table ");
		
		//prints the multiplication table of that number using a for loop. 
		for(int i=1;i<=10;i++)
		{
			//display multiplication from 1 to 10.
			System.out.println(number+" * "+i+" = "+number*i);
		}
		s.close();
	}
}
