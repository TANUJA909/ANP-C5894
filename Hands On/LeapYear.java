package loops;
/*.Write a Java program that takes a year as input 
 * and checks if it is a leap year.
 *  If the year is divisible by 4, check if it is also divisible by 100. 
 *  If it is divisible by 100, check if it is also divisible by 400. 
 *  Print "Leap Year" if it satisfies all the conditions, 
 *  and "Not a Leap Year" otherwise.
 */
import java.util.*;
public class LeapYear 
{
	public static void main(String[] args) 
	{
		// takes a year as input 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a year:");
		int a=s.nextInt();
		
		// checks if it is a leap year
		// If the year is divisible by 4, check if it is also divisible by 100. 
		// Print "Leap Year" if it satisfies all the conditions
		if(a%4==0)
		{
			System.out.println("Leap Year");
		}
		else if(a%100==0)
		{
			System.out.println("Leap Year");
		}
		//If it is divisible by 100, check if it is also divisible by 400.
		// Print "Leap Year" if it satisfies all the conditions
		else if(a%400==0)
		{
			System.out.println("Leap Year");
		}
		//Print "Not a Leap Year" if not satisfies all the conditions
		else
		{
			System.out.println("Not a Leap Year");
		}
		s.close();
	}
}
