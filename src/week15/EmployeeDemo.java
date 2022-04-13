package week15;

//Berke Ozten

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		String name;
		Double hours;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Emploee Name");
		name = input.nextLine();
		
		System.out.println("Please Enter Employee Hours");
		hours = input.nextDouble();
		
		Employee emp = new Employee(name, hours);
		
		System.out.println(
				"Employee "  + emp.getName() +
				" worked for " + emp.getHours() +
				". Total pay is $" + emp.getTotalPay()
				);
		
		input.close();

	}

}
