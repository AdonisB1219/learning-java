import java.util.ArrayList;

public class Almacen {
	public final static ArrayList<Integer> lista = new ArrayList<Integer>();//constante el lugar en e que se almacenan los datos
	public final static int max = 10;
	
	public final static void main(String[] args) {
		Productor prod1 = new Productor();
		prod1.setName("Productor 1");
		prod1.start();
		Productor prod2 = new Productor();
		prod2.setName("Productor 2");
		prod2.start();
		Consumidor cons1 = new Consumidor();
		Consumidor cons2 = new Consumidor();
		Thread t1 = new Thread(cons1);
		Thread t2 = new Thread(cons2);
		t1.start();
		t2.start();
	}//main
}//class almacen
