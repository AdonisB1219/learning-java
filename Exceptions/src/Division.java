import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int a,b;
		Scanner in = new Scanner(System.in);
		System.out.println("Primer nuemro");
		a = in.nextInt();
		System.out.println("segundo numero");
		b= in.nextInt();
		
		int c = 0;
		
		try {
			c = (a/b);
		} catch(Exception e) {
			System.out.println("Hubo un problema " + e.getMessage());
			
		}//se pueden agregar mas catch
		
		System.out.println("la division es " + c);
		
	}

}
