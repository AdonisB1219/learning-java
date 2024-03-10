

public class Rectangulo implements Figura{
	private String name;
	private double base;
	private double altura;
	public Rectangulo(String name, double base, double altura) {
		super();
		this.name = name;
		this.base = base;
		this.altura = altura;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLado() {
		return base;
	}
	public void setLado(double lado) {
		this.base = lado;
	}
	
	
	@Override
	public String toString() {
		return "Rectangulo [name=" + name + ", base=" + base + ", altura=" + altura + "]";
	}
	public double calcularArea() {
		return base*altura;
	}
	
	public double calcularPerimetro() {
		return base * 2 + altura * 2;
	}
}
