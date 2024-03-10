import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> colores = new HashMap<String, String>();
		
		colores.put("RED", "#FF0000");
		colores.put("GREEN", "#00FF00");
		colores.put("BLUE", "#0000FF");
		colores.put("BLACK", "#000000");
		colores.put("FUSHIA", "#DD0950");
		System.out.println(colores);
		System.out.println(colores.size());
		colores.remove("FUSHIA");
		
		for (String color : colores.values()) {
			System.out.println(color);	
		}
		
		for (String llave : colores.keySet()) {
			System.out.println(llave + ": " + colores.get(llave));
		}
		colores.forEach((key, value)->System.out.println(key + ": " + value));
	}//main

}//class HashMap
