
public class Rombo extends Cuadrado implements Figura{
	private double diagMayor;
	private double diagMenor;
	public Rombo(String name, double lado, double diagMenor, double diagMayor) {
		super(name, lado);
		this.diagMayor = diagMayor;
		this.diagMenor = diagMenor;
	}
	
	@Override
	public double calcularArea() {
		return diagMayor + diagMenor /2;
	}
}
