package oops;
//Example of  Encapsulation
/*
1.Create a class called "Person" with private instance variables "name" and "age". 
Implement getter and setter methods for both variables.
 Write a main method to create an instance of the class 
 and demonstrate the encapsulation by accessing and modifying the variables using the getter and setter methods.
*/
//Create a class called "Person" with private instance variables "name" and "age"
public class Person {
	private String name;
	private int age;
	
	//Implement getter and setter methods for both variables.
	//getName method
	public String getName() {
		return name;
	}
	//setName method
	public void setName(String name) {
		this.name = name;
	}
	
	//getAge method
	public int getAge() {
		return age;
	}
	//setAge method
	public void setAge(int age) {
		this.age = age;
	}
}
class PersonMain
{
	public static void main(String[] args)
	{
		// Creating instance of class Person
		Person p =new Person();
		
		//set value
		p.setName("TANUJA");
		p.setAge(20);
		
		//Print value
		System.out.println("Name is: "+p.getName());
		System.out.println("Age is: "+p.getAge());
	}
	
}
