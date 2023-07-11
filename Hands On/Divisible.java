package loops;
import java.util.*;
/*Write a Java program that takes an integer as input
  and checks if it is divisible by 5 and 11. 
  Print "Divisible" if it is divisible by both,
   and "Not Divisible" otherwise
*/
public class Divisible 
{
	public static void main(String[] args) 
	{
		//takes an integer as input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=s.nextInt();
		
		//integer as input and checks if it is divisible by 5 and 11.
		if(a%5==0&&a%11==0)
		{
			// Print "Divisible" if it is divisible by both
			System.out.println("The number entered is Divisible by 5 and 11.");
		}
		else
		{
			// Print "Not Divisible" if it is not divisible by both
			System.out.println("The number entered is Not Divisible by 5 and 11.");
		}
		s.close();
	}

}
