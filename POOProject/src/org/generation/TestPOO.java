package org.generation;

import org.generation.classes.Consultor;
import org.generation.classes.Employee;
import org.generation.classes.Manager;
import org.generation.classes.Person;
import org.generation.exceptions.EmailFormatException;
import org.generation.payroll.Payroll;

public class TestPOO {
	public static void main(String[] args) {
		Person carlos = new Employee("Carlos Bernal", 22, "cbernal@gmail.com", "XXAX00000","Domicilio conocido", "ti", 450);
		Person diego = new Employee("Diego Fer", 22, "dflg@gmail.com", "XXAX00000","Otro domicilio conocido", "ti", 500); //Definidos como person e instanciados como employee
		Employee itzel = new Employee("Itzel Pérez", 22, "iperez@gmail.com", "XXASDAF", "casa", "ti", 520);
		Manager daniela = new Manager("Daniela Heredia", 23, "dheredia@gmail.com", "XXASDAF", "casa", "ti", 650, 20, 150);
		Consultor ana = new Consultor("Ana Cortes y asociados", "XAX00000", 1250.20);
		Payroll.printReceipt(itzel);
		Payroll.printReceipt(daniela);
		Payroll.printReceipt(ana);


		Payroll.printReceipt((Employee)diego);

		try {
			diego.setEmail("dflg@gmail.com");
		} catch (EmailFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(itzel);
		System.out.println(diego.toString());
		System.out.println(carlos);
		
		System.out.println(Person.getTotal());


	}
}
