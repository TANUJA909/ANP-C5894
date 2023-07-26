package operators;
/*
 Q2. Write a Java program that takes an integer as user input 
 and checks if it is a positive number.
 */
import java.util.Scanner;

public class ChecksPositiveNumber {

	public static void main(String[] args) {
		// takes an integer as input 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		//for integer
		int integer=s.nextInt();
		
		//checks if it is positive number using if else loop 
		if(integer>0)
		{
			//Print "Positive" if the number is greater than 0
			System.out.println("The number entered is Positive Number");
		}
		else
		{
			
			System.out.println("The number entered is not Positive Number");
		}
		s.close();
	}

}
