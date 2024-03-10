
public class Productor extends Thread{
	@Override
	public void run() {
		System.out.println("INICIO DEL PRODUCTOR " + getName());
		int cont = 0;
		while(cont < Almacen.max) {
			Integer num = Integer.valueOf((int) (Math.random()*500));
			synchronized (Almacen.lista) {
			Almacen.lista.add(num);
			} //proteger de modificaciones la lista mientras le agrega el elemento
			System.out.println("Productor " + Almacen.lista.size());
			try {
				Thread.sleep(num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cont++;
		}//while
		System.out.println("***FIN DEL PRODUCTOR " + getName());
	}//run
}//class Productor
