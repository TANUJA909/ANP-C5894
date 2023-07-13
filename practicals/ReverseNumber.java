package loops;
//Program to print reverse of a number
public class ReverseNumber {

	public static void main(String[] args) 
	{
		//initializing number
		int n=4656798;
		
		//reversed number (r) initialized to 0
		int rn=0;
		
		//condition to check number is not equal to 0
		while(n!=0)
		{
			int r=n%10;
			rn=rn*10+r;
			n/=10;			
		}
		 //print reverse number
		 System.out.println("Reversed number: " + rn);
	}
}
