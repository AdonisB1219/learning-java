
public class Trapecio {
	private double baseMenor;
	private double baseMayor;
	private String name;
	private double lado;
	private double altura;
	public Trapecio(double baseMenor, double baseMayor, String name, double lado, double altura) {
		super();
		this.baseMenor = baseMenor;
		this.baseMayor = baseMayor;
		this.name = name;
		this.lado = lado;
		this.altura = altura;
	}//constructor
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Trapecio [baseMenor=" + baseMenor + ", baseMayor=" + baseMayor + ", name=" + name + ", lado=" + lado
				+ ", altura=" + altura + "]";
	}
	
	public double calcularPerimetro() {
		return altura / 2 * (baseMenor + baseMayor);
	}
	
	public double calcularArea() {
		return lado * 2 + baseMenor + baseMayor;
	}
	
}//clase trapedcio
