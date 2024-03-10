import java.util.Random;

public class CicloThread extends Thread{
	private int max = 0;
	private Random random;
	
	public CicloThread(int max, String name) {
	    this.max = max;
	    setName(name);
	    random = new Random();
	}//constructor
	
	public void run() {
		int cont = 0;
		while (cont < this.max) {
			System.out.println(this.getName() + ": " + cont++);
			try {
				Thread.sleep(random.nextInt(1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//while
		System.out.println("FIN " + this.getName());
		
	}//run
	
	public static void main(String[] args) {
		CicloThread t1 = new CicloThread(15, "T1");
		CicloThread t2 = new CicloThread(10, "T2");
		CicloThread t3 = new CicloThread(20, "T3");
		CicloThread t4 = new CicloThread(5, "T4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}//main

}//cicloThread
