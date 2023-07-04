package oops;
//Example of  Encapsulation
class Student {
	private int rollno;
	private String name;
	private int age;
	private String address;
	
	//getRollno method
	public int getRollno() {
		return rollno;
	}
//setRollno method
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

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

//getAddress method
	public String getAddress() {
		return address;
	}
//setAddress method
	public void setAddress(String address) {
		this.address = address;
	}
}

class A
{
	public static void main(String[] args) {
		//Creating instance of class Student
		Student s=new Student();
		
		//sitting value
		s.setRollno(7);
		s.setName("Tanu");
		s.setAge(20);
		s.setAddress("Koparkhairane sec. 12");
		
		//Print value
		System.out.println("Roll no.: "+s.getRollno());
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());
		System.out.println("Address: "+s.getAddress());
	}
}
