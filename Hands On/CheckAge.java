package operators;
/*
1.Write a Java program that prompts the user to enter their age. 
The program should check if the age is between 18 and 30 (inclusive)
and print "Eligible for Job" if true,
or "Not Eligible for Job" otherwise. 
*/
import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) 
	{
		//input from the use
		Scanner sc = new Scanner(System.in);
		
		// prompts the user to enter their age.
		System.out.println("Enter the age: ");
		
		//for age
		int age=sc.nextInt();
		
		//The program should check if the age is between 18 and 30 (inclusive) using if else loop
		// and print "Eligible for Job"  if true, or "Not Eligible for Job" otherwise.
		if(age>=18 && age<=30)
		{
			System.out.println("Eligible for Job");
		}
		else
		{
			System.out.println("Not Eligible for Job");
		}
		sc.close();
	}

}
