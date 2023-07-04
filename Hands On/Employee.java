package oops;
//Example of  Encapsulation
class Employee {
	private int ID;
	private String name;
	private int salary;
	private String education;
	private String WE;
	
	//getID method
	public int getID() {
		return ID;
	}
	//setID method
	public void setID(int iD) {
		ID = iD;
	}

	//getName method
	public String getName() {
		return name;
	}

	//setName method
	public void setName(String name) {
		this.name = name;
	}

	//getSalary method
	public int getSalary() {
		return salary;
	}
	//setSalary method
	public void setSalary(int salary) {
		this.salary = salary;
	}

	//getEducation method
	public String getEducation() {
		return education;
	}
	//setEducation method
	public void setEducation(String education) {
		this.education = education;
	}

	//getWE method
	public String getWE() {
		return WE;
	}
	//setWE method
	public void setWE(String wE) {
		WE = wE;
	}

}

class EmployeeMain
{
	public static void main(String[] args) {
		//Creating instance of class Employee
		Employee e= new Employee();
		
		//sitting value
		e.setID(7);
		e.setName("Tanu");
		e.setEducation("BSc IT");
		e.setWE("Fresher");
		e.setSalary(1000000);
		
		//Print value
		System.out.println("ID: "+e.getID());
		System.out.println("Name: "+e.getName());
		System.out.println("Education: "+e.getEducation());
		System.out.println("Work Experience: "+e.getWE());
		System.out.println("Salary: "+e.getSalary());
		

	}
}
