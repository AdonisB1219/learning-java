
public class DoWhileDemo {

	public static void main(String[] args) {
		int cont = 0;
		int i = 0;
		do {
			System.out.println(cont);
			cont ++;
		} while (cont <= 10) ;
		
		do {
			System.out.println(i);
			i += 2;
			if (i == 70) {
				break;
			}
		} while (i <= 100) ;
	}//main

}//class
