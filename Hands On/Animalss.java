package oops;
/*
3.Create a class called "Animal" with instance variables "name" and "age". 
Implement getter and setter methods for both variables. 
Create a subclass called "Dog" that inherits from "Animal" 
and adds an instance variable called "breed". 
Implement getter and setter methods for the "breed" variable. 
Write a main method to create an instance of the "Dog" class, 
demonstrate the inheritance by accessing and modifying the variables using the getter and setter methods.
*/
//Create a class called "Animal" with instance variables "name" and "age"
public class Animalss
{
	private String name;
	private int age;
	
	//Implement getter and setter methods for both variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
// Create a subclass called "Dog" that inherits from "Animal"
class Dogss extends Animalss
{
	// adds an instance variable called "breed".
	private String breed;
	
	// Implement getter and setter methods for the "breed" variable.
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
//Write a main method to create an instance of the "Dog" class
class AnimalssMain
{
	public static void main(String[] args)
	{
		Dogss d=new Dogss();
		
		//set value
		d.setName("Tomy");
		d.setAge(2);
		d.setBreed("Bull dog");
		
		//Print value
		System.out.println("Name is: "+d.getName());
		System.out.println("Age: "+d.getAge());
		System.out.println("Breed: "+d.getBreed());

	}
	
	
}
