package oops;
//Example of  Encapsulation and inheritance
/*
 2.Create a class called "Person" with instance variables "name" and "age". 
 Implement getter and setter methods for both variables. 
 Create a subclass called "Employee" that inherits from "Person"
 and adds an instance variable called "salary".
 Implement getter and setter methods for the "salary" variable. 
 Finally, create another subclass called "Manager" that inherits from "Employee" 
 and adds an instance variable called "department". 
 Implement getter and setter methods for the "department" variable. 
 Write a main method to create an instance of the "Manager" class, 
 demonstrate the inheritance by accessing and modifying the variables using the getter and setter methods at each level of the hierarchy.
 */
//Create a class called "Person" with instance variables "name" and "age".
public class Persons
{
	private String name;
	private int age;
	
	// Implement getter and setter methods for both variables.
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

//Create a subclass called "Employee" that inherits from "Person" and adds an instance variable called "salary".
class Employees extends Persons
{
	private int salary;
	
	// Implement getter and setter methods for the "salary" variable
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}	
}

//create another subclass called "Manager" that inherits from "Employee" 
class Manager extends  Employees
{
	//adds an instance variable called "department"
	private String department;
	
	// Implement getter and setter methods for the "department" variable.
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}	
}
// Write a main method to create an instance of the "Manager" class
class PersonsMain
{
	public static void main(String[] args)
	{
		Manager m=new Manager();
		
		//set value
		m.setName("Tanuja");
		m.setAge(20);
		m.setSalary(100000);
		m.setDepartment("IT");
		
		//Print value
		System.out.println("Name: "+m.getName());
		System.out.println("Age: "+m.getAge());
		System.out.println("Salary: "+m.getSalary());
		System.out.println("Department: "+m.getDepartment());

	}	
}
