package oops;
//Example of Multilevel inheritance
//super class or base class or parent class
public class Vehicle 
{
	//fields & methods
	String brand;
	int year;
	public void displayInfo()
	{
		System.out.println("Enter Brand and Year ");
	}
}
class Car extends  Vehicle
{
	//fields & methods of Animal class
	//fields & methods of Vehicle class
	String model;
	
}

class SportsCar extends Car
{
	  //fields & methods of Animal class
     //fields & methods of Vehicle class
	//fields & methods of SportsCar class
	int topSpeed;
	public void displayInfo()
	{
		System.out.println("Enter Brand, Model, Year, Top Speed ");
	}
	
}

class VehicleMain
{
	public static void main(String[] args)
	{
		//creating object of sub class
		SportsCar s=new SportsCar();
		//access fields & methods
		s.brand="Tanu";
		s.model="t123";
		s.year=2012;
		s.topSpeed=140;
		s.displayInfo();
		//Print value
		System.out.println("Brand: "+s.brand);
		System.out.println("Model: "+s.model);
		System.out.println("Year: "+s.year);
		System.out.println("Top Speed: "+s.topSpeed);
	}
}


