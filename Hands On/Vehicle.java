package thursdayLab_3_8_2023;
/*
 Thursday Lab
 Question 4: Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()". 
 Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class and implement the abstract methods. 
 Write a Java program to demonstrate starting and stopping operations for a car and a motorcycle.
 */

//Create an abstract class called "Vehicle"
abstract class Vehicle 
{
	//abstract methods "start()" and "stop()".
	public abstract void start();
	public abstract void stop();
}

//Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class  
class Car extends Vehicle
{
	//implement the abstract methods. 
	public void start()
	{
		System.out.println("Start the Car");
	}
	
	public void stop()
	{
		System.out.println("Stop the Car");
	}
}

class Motorcycle extends Vehicle
{
	//implement the abstract methods. 
	public void start()
	{
		System.out.println("Start the Motorcycle");
	}
	
	public void stop()
	{
		System.out.println("Stop the Motorcycle");
	}
}

// demonstrate starting and stopping operations for a car and a motorcycle.
class VehicleMain
{
	public static void main(String[] args)
	{
		//creating object of sub class Car
		Car c=new Car();
		c.start();
		c.stop();
		
		//creating object of sub class Motorcycle
		Motorcycle m=new Motorcycle();
		m.start();
		m.stop();
	}

}