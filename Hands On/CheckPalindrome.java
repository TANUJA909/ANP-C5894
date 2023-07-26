package operators;
/*
2.Write a Java program that prompts the user to enter a three-digit number. 
The program should check if the number is a palindrome, 
which means it reads the same forwards and backwards. 
*/
import java.util.Scanner;
public class CheckPalindrome {

	public static void main(String[] args) 
	{
		//input from the use
		Scanner sc = new Scanner(System.in);
		
		// prompts the user to enter a three-digit number.
		System.out.println("Enter a three-digit number: ");
		
		//for three-digit number
		int number=sc.nextInt();
		int originalNumber=number;
		int reversenumber=0;
		int remainder;
		
		//get the reverse number to original number
		while(number!=0)
		{
			remainder=number%10;
			reversenumber=reversenumber*10+remainder;
			number/=10;		
		}
		
		//check if the number is a palindrome, 
		//which means it reads the same forwards and backwards. 
		if(originalNumber==reversenumber)
		{
			System.out.println(originalNumber+" is palindrome");
		}
		else
		{
			System.out.println(originalNumber+" is not palindrome");
		}
		sc.close();
	}
}
