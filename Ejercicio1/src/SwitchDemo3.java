import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe el número del mes (1-12): ");
		int month = in.nextInt();
		String monthString = "";//Se convirtió con ctrl+1
		monthString = switch (month) {
		case 1 -> "Enero";
		case 2 -> "Febrero";
		case 3 -> "Marzo";
		case 4 -> "Abril";
		case 5 -> "Mayo";
		case 6 -> "Junio";
		case 7 -> "Julio";
		case 8 -> "Agosto";
		case 9 -> "Septiembre";
		case 10 -> "Octubre";
		case 11 -> "Noviembre";
		case 12 -> "Diciembre";
		default -> "Inválido";
		};
		in.close();
		System.out.println(monthString);
	}//main

}
