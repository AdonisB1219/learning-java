package org.generation.payroll;

import java.util.Date;

import org.generation.classes.Employee;
import org.generation.classes.pagable.Pagable;

public class Payroll {
	public static void printReceipt(Pagable e) {
		System.out.println("+===================+");
		System.out.println("| Recibo de pago de " + e.getName());
		System.out.println("| RFC: " + e.getRfc());
		System.out.println("| Departamento: " + e.getDepartment());
		System.out.println("| Por la cantidad de: $" + e.calculateSalary(30));
		System.out.println("| Número de empleado: " + e.getId());
		System.out.println("| Fecha: " + new Date());
		System.out.println("+===================+");
	}//printRecepti
}//class Payroll
