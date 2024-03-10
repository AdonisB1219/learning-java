package org.generation.classes;

public class Manager extends Employee{
	private int numberOfEmployees;
	private double bonus;
	public Manager(String name, int age, String email, String rfc, String address, String department, double salary,
			int numberOfEmployees, double bonus) {
		super(name, age, email, rfc, address, department, salary);
		this.numberOfEmployees = numberOfEmployees;
		this.bonus = bonus;
	}//Constructor
	
	@Override
	public String calculateSalary(int days) {
		double total = 0;
		total = getSalary() * days * 1.16 + numberOfEmployees * bonus;
		return String.format("%.2f", total);
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "Manager [numberOfEmployees=" + numberOfEmployees + ", bonus=" + bonus + "]";
	}
	
	
}//class Manager
