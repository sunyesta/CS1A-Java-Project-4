//Creates an object of "Employee" and calles all of its methods
import java.util.ArrayList;
import java.util.Scanner;
public class TestEmployee{
	public static void main(String[]args){
		Employee employee = new Employee("Mary","Zlateva","20370182",16.78);
		Employee emptyEmployee = new Employee();
		
		
		System.out.println("Testing empty employee:\n");
		System.out.println(emptyEmployee);
		
		System.out.println("\nNew Employee:");
		System.out.println();
		
		System.out.println("\tFirst Name: "+employee.getFirstName());
		System.out.println("\tLast Name: "+employee.getLastName());
		System.out.println("\tSocial Security Number: "+employee.getSocialSecurityNumber());
		System.out.println("\tSalery: $"+employee.getSalery());
		
		System.out.println("\nChange all traits of employee:");
		
		employee.setFirstName("Rachel");
		employee.setLastname("Small");
		employee.setSocialSecurityNumber("100021232");
		employee.setSalery(17.98);
		
		System.out.println();
		System.out.println(employee);
		
		float raise = .54f;
		employee.giveRaise(raise);
		
		System.out.println();
		System.out.println("After "+raise+"% raise:\n");
		System.out.println(employee);
		
		
		ArrayList<Employee>employees = new ArrayList<Employee>();
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<4;i++){
			String firstName;
			String lastName;
			String socialSecurityNumber;
			int salary;
			System.out.println("New Employee:");
			System.out.println("What is their first name?");
			firstName = s.nextLine();
			System.out.println("What is their last name?");
			lastName = s.nextLine();
			System.out.println("What is their social security number?");
			socialSecurityNumber = s.nextLine();
			System.out.println("What is their salary?");
			salary = s.nextInt();
			employees.add(new Employee(firstName,lastName,socialSecurityNumber,salary));
		}
		
		for(int i=0;i<employees.size();i++){
			System.out.println(employees.get(i));
		}
		
	}
}

/*Testing empty employee:

        First Name: first name
        Last Name: last name
        Social Security Number: 0
        Salery: $0.0

New Employee:

        First Name: Mary
        Last Name: Zlateva
        Social Security Number: 20370182
        Salery: $16.78

Change all traits of employee:

        First Name: Rachel
        Last Name: Small
        Social Security Number: 100021232
        Salery: $17.98

After 0.54% raise:

        First Name: Rachel
        Last Name: Small
        Social Security Number: 100021232
        Salery: $27.69
*/