//Holds values of an Employee object and can reset the values
public class Employee{

	private String firstame;
	private String lastName;
	private String socialSecurityNumber;
	private double salary;
	
	
	//defines initial variables of Employee when a new Employee object is created
	public Employee(String firstame,String lastName,String socialSecurityNumber,double salary){
		this.firstame = firstame;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.salary = salary;
	}
	
	
	//defines initial variables of Employee when a new Employee object is created without parameters
	public Employee(){
		firstame = "first name";
		lastName = "last name";
		socialSecurityNumber = "00000000";
		salary = 0;
	}
	
	//gets First name
	public String getFirstName(){
		return firstame;
	}
	
	//gets last name
	public String getLastName(){
		return lastName;
	}
	
	//gets social security number
	public String getSocialSecurityNumber(){
		return socialSecurityNumber;
	}
	
	//gets salary
	public double getSalery(){
		return salary;
	}
	
	//sets firstname to pasted in variable
	public void setFirstName(String firstame){
		this.firstame = firstame;
	}
	
	//sets lastName to pasted in variable
	public void setLastname(String lastName){
		this.lastName = lastName;
	}
	
	//sets socialSecurityNumber to pasted in variable
	public void setSocialSecurityNumber(String socialSecurityNumber){
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	//sets salary to pasted in variable
	public void setSalery(double salary){
		this.salary = ((double)Math.round(salary*100.0))/100.0;
	}
	
	//returns all values
	public String toString(){
		return "\tFirst Name: "+firstame+"\n\tLast Name: "+lastName+"\n\tSocial Security Number: "+socialSecurityNumber+"\n\tSalery: $"+salary;
	}
	
	//takes in a percentRaise and adds it into the salary
	public void giveRaise(float percentRaise){
		salary*=(1+percentRaise);
		salary = ((double)Math.round(salary*100.0))/100.0;
	}
	
	
}