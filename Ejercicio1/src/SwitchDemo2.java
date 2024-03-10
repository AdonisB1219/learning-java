import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe el número del mes (1-12): ");
		int month = in.nextInt();
		String monthString = "";
		switch(month) {
		case 1:
			monthString = "Enero";
			break;
		case 2:
			monthString = "Febrero";
			break;
		case 3:
			monthString = "Marzo";
			break;
		case 4:
			monthString = "Abril";
			break;
		case 5:
			monthString = "Mayo";
			break;
		case 6:
			monthString = "Junio";
			break;
		case 7:
			monthString = "Julio";
			break;
		case 8:
			monthString = "Agosto";
			break;
		case 9:
			monthString = "Septiembre";
			break;
		case 10:
			monthString = "Octubre";
			break;
		case 11:
			monthString = "Noviembre";
			break;
		case 12:
			monthString = "Diciembre";
			break;
		default:
			monthString = "Inválido";
		}//switch month
		in.close();
		System.out.println(monthString);
	}//main

}
