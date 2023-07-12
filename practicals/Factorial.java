package loops;
//A program that prints the factorial of a given number from user input

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		//Scanner class object
		Scanner s=new Scanner(System.in);
		
		 System.out.print("Enter a number to calculate its factorial: ");
		 double n= s.nextInt();
		 double f=1;
		 for(double i=1;i<=n;i++)
		 {
			 f*=i;
		 }
		 
		 System.out.println("The factorial of " + n + " is: " + f);
		 s.close();
	}
}
