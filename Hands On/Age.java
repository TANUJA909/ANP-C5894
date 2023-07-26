package operators;
/*
 Q1.Write a Java program that prompts the user to enter their age. 
 The program should check if the age is greater than or equal to 18 
 and print "You are an adult" if true,
  or "You are a minor" otherwise.
 */
import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		//input from the use
		Scanner sc = new Scanner(System.in);
		
		// prompts the user to enter their age.
		System.out.println("Enter the age: ");
		
		//for age
		int age=sc.nextInt();
		
		//The program should check if the age is greater than or equal to 18 using if else loop
		// and print "You are an adult"  if true, or "You are a minor" otherwise.
		if(age>=18 )
		{
			System.out.println("You are an adult");
		}
		else
		{
			System.out.println("You are a minor");
		}
		sc.close();

	}

}
