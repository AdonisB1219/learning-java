package org.generation.classes.pagable;

public interface Pagable {
	public String getName();
	public String getRfc();
	public int getId();
	public String getDepartment();
	public String calculateSalary(int days);
}
