package org.generation.classes;

import org.generation.classes.pagable.Pagable;

public class Employee extends Person implements Pagable {
	private String department;
	private double salary;
	
	public Employee(String name, int age, String email, String rfc, String address, String department, double salary) {
		super(name, age, email, rfc, address);
		this.department = department;
		this.salary = salary;
	}//constructor
	public String getDepartment() {
		return department;
	}//getDept
	public void setDepartment(String department) {
		this.department = department;
	}//setDept
	public double getSalary() {
		return salary;
	}//getSalary
	public void setSalary(double salary) {
		this.salary = salary;
	}//setSalary
	@Override
	public String toString() {
		return "Employee [department=" + department + ", salary=" + salary + super.toString() + "]";
	}
	public String calculateSalary(int days) {
		double total = 0;
		total = this.salary * days * 1.16;
		return String.format("%.2f", total);
	}
	public String getDepartament() {
		return department;
	}
	
	
	
	
	
	
}//class employee
