package loops;

/*
 Temperature Conversion:
Switch case hands-on
Prompt the user to enter a temperature in Celsius.
Provide a menu to choose the conversion type: Fahrenheit, Kelvin, or Rankine.
Use a switch case statement to perform the selected conversion and display the result.
Handle invalid conversion choices appropriately.
 */

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) 
	{
		//input from the use
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user to enter a temperature in Celsius.
		System.out.println("Enter a temperature in Celsius:");
		
		//for temperature in Celsius
		double celsius = sc.nextInt();
		//for temperature in fahrenheit
		double fahrenheit;
		//for temperature in kelvin
		double kelvin;
		//for temperature in rankine
		double rankine;
		
		//Provide a menu to choose the conversion type: Fahrenheit, Kelvin, or Rankine.
        System.out.println("Choose the conversion type: Fahrenheit, Kelvin, or Rankine.:");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        System.out.println("3. Rankine");
        System.out.print("Choose the conversion type number: ");
        
        int conversion=sc.nextInt();
        //Use a switch case statement to perform the selected conversion and display the result.
        switch(conversion)
        {
        case 1:
        	fahrenheit=celsius*1.8+32;
        	System.out.println("Temperature in fahrenheit: "+fahrenheit);
        	break;
        case 2:
        	kelvin=celsius+273.15;
        	System.out.println("Temperature in Kelvin: "+kelvin);
        	break;
        case 3:
        	rankine=celsius*1.8+491.67;
        	System.out.println("Temperature in Rankine: "+rankine);
        	break;
        default:
            System.out.println("Error: invalid conversion choices appropriately.");
            break;
        }
        sc.close();
	}

}
