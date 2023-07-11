package loops;
/*Write a Java program that takes an integer as input and checks if it is divisible by 2, 3, or both.
 * Print "Divisible by 2" if it is divisible by 2, "Divisible by 3" if it is divisible by 3, 
 * and "Divisible by both 2 and 3" if it is divisible by both.
*/
import java.util.*;
public class DivisibleBy {
	public static void main(String[] args) 
	{
		//takes an integer as input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int a=s.nextInt();
				
		// checks if it is divisible by 2, 3, or both
		//Print"Divisible by both 2 and 3" if it is divisible by both.
		if(a%2==0&&a%3==0)
		{
			System.out.println("The number entered is Divisible by both 2 and 3");			
		}
		//Print "Divisible by 2" if it is divisible by 2
		else if(a%2==0)
		{
			System.out.println("The number entered is Divisible by 2");
		}
		//Print "Divisible by 3" if it is divisible by 3
		else if(a%3==0)
		{
			System.out.println("The number entered is Divisible by 3");
		}
		else
		{
			// Print "Not Divisible" if it is not divisible by both
			System.out.println("The number entered is Not Divisible by both 2 or 3");
	    }
		s.close();
	}
}

