import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(35);	numeros.add(33);	numeros.add(42);
		numeros.add(10);	numeros.add(14); 	numeros.add(19);
		numeros.add(27);	numeros.add(44);	numeros.add(26);
		numeros.add(31);
		
		System.out.println(numeros.size());
		System.out.println(numeros.get(0));
		System.out.println(numeros.isEmpty());
		System.out.println(numeros.indexOf(300));
		System.out.println(numeros.lastIndexOf(31));
		System.out.println(numeros.contains(0));
		System.out.println(numeros.set(numeros.size()-1, 40));
		System.out.println(numeros.remove(0));//regresa el elemento
		

		
//		for (Integer i : numeros) {
//			System.out.println(i);
//		}
		
		numeros.forEach( (num)->imprimirPares(num));
				
	}//main
	
	public static void imprimirPares(Integer num) {
		if (num % 2 == 0) {
			System.out.println("El numero " + num + " es par.");
		} else {
			System.out.println("El numero " + num + " es impar.");
		}
	}//impimirpares

}//class ArrayListDemo
