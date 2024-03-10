
public class Consumidor implements Runnable{

	@Override
	public void run() {
		System.out.println("INICIANDO Consumidor...");
		int cont = 0;
		while(cont < Almacen.max) {
			if(Almacen.lista.size() == 0) {
				System.out.println("Consumidor durmiendo zzz");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//if size
			synchronized (Almacen.lista) {
			System.out.println("Consumiendo: " + Almacen.lista.remove(0));
			}
			cont++;
		}//while
	}//run

}//consumidor
