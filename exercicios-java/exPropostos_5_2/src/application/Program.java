package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.println("Insert name: ");
		employee.name = sc.nextLine();
		System.out.println("Insert Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Insert Tax: ");
		employee.tax = sc.nextDouble();
		
		employee.netSalary();
		System.out.println(employee);
		
		System.out.println("Which percentage to increase salary? ");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);
		
		System.out.println("Updated data: " + employee);
		
	}

}
