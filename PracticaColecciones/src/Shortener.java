import java.util.HashMap;
import java.util.Scanner;

public class Shortener {
	
	public static HashMap<String, String> map;
	public static Scanner in;
	public static final String url = "https://genmex.to/";
	
	public static void main(String[] args) {
		map = new HashMap<String, String>();
		in = new Scanner(System.in);
		char opcion;
		do {
			System.out.println("==================");
			System.out.println("Escribe la letra de la acción a realizar");
			System.out.println("(C) para crear");// 
			System.out.println("(R) para buscar");// 
			System.out.println("(X) para salir");
			System.out.print("> ");
			String comando = in.nextLine();
			opcion = (comando.length() == 0) ? ' ' : comando.toUpperCase().charAt(0);
			switch (opcion) {
			case 'C':
				System.out.println(crearLink());
				break;
			case 'R':
				System.out.println(consultarLink());
				break;
			case 'X':
				System.out.println("Salir");
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}// switch
		} while (opcion != 'X');
		in.close();
	}//main
	
	public static String consultarLink() {
		String res = "No se pudo conultar el URL solicitado";
		System.out.println("Esribe el URL a consultar:");
		String link = in.nextLine();
		link = link.substring(url.length());
		if (map.containsKey(link)) {
			res = map.get(link);
		}//if containsKey
		return res;
		}//consultar
	
	public static String crearLink() {
		String res = "No se pudo generar el URL corto";
		System.out.println("Escribe el link: ");
		String link = in.nextLine().trim();
		if (link.length() > 10) {
			if (map.containsValue(link)) {
				for (String key : map.keySet()) {
					if(map.get(key).equals(link)) {
						res = url + key;
					}
				}//for each map.keyset
			}//if contains link
			else {
				long num = Math.round(Math.random()*100000);
				map.put(Long.toString(num), link);
				res = url + num;
			}//else contains link
		}//length 
		return res;
	}// agregarCategoria

}//class Shortener


//int unicode = (int) Math.round(Math.random()*10)+100;
//System.out.print(Character.toChars(unicode));
//char c = (char) unicode;
//System.out.print(c);
