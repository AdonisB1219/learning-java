
public class Cuadrado implements Figura {
	private String name;
	private double lado;
	public Cuadrado(String name, double lado) {
		super();
		this.name = name;
		this.lado = lado;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Cuadrado [name=" + name + ", lado=" + lado + "]";
	}
	
	public double calcularArea() {
		return lado*lado;
	}
	
	public double calcularPerimetro() {
		return lado*4;
	}
}
