package org.generation.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.generation.exceptions.EmailFormatException;

public abstract class Person {
	private String name;
	private int age;
	private String rfc;
	private String email;
	private String address;
	private int id;
	private static int total = 0;
	
	public Person(String name, int age, String email, String rfc, String address) {
		this.name = name.toUpperCase();
		this.age = age>=18?age:18;
		this.email = email.toLowerCase();
		this.rfc = rfc.toUpperCase();
		this.address = address;
		Person.total ++;
		this.id = Person.total;
	}//constructor
	
	public Person(String name, int age, String email) {
		this(name, age, email, "XXXX000000", "direccion no valida");//llama al constructor con ese numero de parametros
		
	}
	
	public int getAge() {
		return this.age;
	}//getAge
	
	public void setAge(int age) {
		this.age = age>=18?age:18;
	}//setAge
	
	public String getName() {
		return this.name;
	}//getName
	public void setName(String name) {
		this.name = name.trim();
	}//setAName
	
	public String getRfc() {
		return this.rfc;
	}//getrfc
	public void setRfc(String rfc) {
		this.rfc = rfc.trim().toUpperCase();
	}//setrfc
	
	public String getEmail() {
		return this.email;
	}//getrfc
	public void setEmail(String email) throws EmailFormatException {
		this.email = "jdoe@hotmail.com";
		Pattern regex = Pattern.compile("^[a-z_0-9.%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}", 
					Pattern.CASE_INSENSITIVE);
		Matcher matcher = regex.matcher(email);
		if (matcher.matches()) {
			this.email = email.trim().toLowerCase();
		}//si el correo es vaido
		else {
			throw new EmailFormatException("El formato del correo no es válido [" + email +  "]");
		}
	}//setemail
	
	public String getAddress() {
		return this.address;
	}//getaddress
	public void setAddress(String address) {
		this.address = address.trim().toLowerCase();
	}//setAddress
	
	
	
	public int getId() {
		return id;
	}

	public static int getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", rfc=" + rfc + ", email=" + email + ", address=" + address
				+ "]";
	}
	
	

}
