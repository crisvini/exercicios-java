package entities;

public class Employee {

	public String name;
	public double grossSalary, tax, newSalary;
	
	public double netSalary() {
		
		grossSalary -= tax;
		return grossSalary;
		
	}
	
	public void increaseSalary(double percent) {
		
		grossSalary = (percent / 100) * grossSalary + grossSalary;
		
	}
	
	public String toString() {
		
		return "Name: "
				+ name
				+ ", Salary: "
				+ String.format("%.2f", grossSalary);
		
	}
	
}
