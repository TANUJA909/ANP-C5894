package loops;

/*
 Prompt the user to enter a numerical grade (0-100).
Use a switch case statement to determine the corresponding letter grade based on the following scale:
90-100: A
80-89: B
70-79: C
60-69: D
0-59: F
Display the letter grade to the user.
Handle input validation to ensure the grade is within the valid range. 
*/

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) 
	{
		//input from the use
		Scanner sc = new Scanner(System.in);
		// Prompt the user to enter a numerical grade (0-100).
		System.out.println("Enter a numerical grade (0-100):");
		
		//for numerical grade (0-100)
        int numericalGrade = sc.nextInt();
        //for letter Grade
        String letterGrade;
        
        //Handle input validation to ensure the grade is within the valid range using if loop
        if(numericalGrade<0 ||numericalGrade>100)
        {
        	System.out.println("Invalid numerical grade ");
        }
        //condition
        while(numericalGrade<0 ||numericalGrade>100)
        {
        	
        }
        
        //Display the letter grade to the user using switch-case
        switch(numericalGrade/10)
        {
        	case 10:
        	case 9:
        		letterGrade = "A";
        		break;
        		
        	case 8:
        		letterGrade = "B";
        		break;
        		
        	case 7:
        		letterGrade = "C";
        		break;
        		
        	case 6:
        		letterGrade = "D";
        		break;
        		
        	case 5:
        		letterGrade = "E";
        		break;
        		
        	default:
        		letterGrade= "F";
        		
        }
        //Display the letter grade
        System.out.println("Letter Grade is: "+ letterGrade);
        
        sc.close();
	}

}
