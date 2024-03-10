package org.generation.classes;

import org.generation.classes.pagable.Pagable;

public class Consultor implements Pagable{
	private String razonSocial;
	private String RFC;
	private double costoHora;
	public Consultor(String razonSocial, String Rfc, double costoHora) {
		super();
		this.razonSocial = razonSocial;
		this.RFC = Rfc;
		this.costoHora = costoHora;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getRFC() {
		return RFC;
	}
	public void setRFC(String rFC) {
		RFC = rFC;
	}
	public double getCostoHora() {
		return costoHora;
	}
	public void setCostoHora(double costoHora) {
		this.costoHora = costoHora;
	}
	
	@Override
	public String getName() {
		return this.razonSocial;
	}//getname
	
	@Override
	public String getRfc() {
		return this.getRFC();
	}//getrfc
	
	@Override
	public int getId() {
		return -1;
	}
	@Override
	public String getDepartment() {
		return "Consultor externo";
	}
	@Override
	public String calculateSalary(int days) {
		return String.format("%.2f",days*8*costoHora*1.16);
	}
	
	
	
	
}
