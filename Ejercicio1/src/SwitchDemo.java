import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Escribe el número del mes (1-12): ");
		int month = in.nextInt();
		String monthString = "";
		switch(month) {
		case 1, 3, 5, 7, 8, 10, 12:
			monthString = "31";
			break;
		case 2:
			monthString = "28";
			break;
		case 4, 6, 9, 11:
			monthString = "30";
			break;
		default:
			monthString = "Inválido";
		}//switch month
		in.close();
		System.out.println(monthString);
	}//main

}
