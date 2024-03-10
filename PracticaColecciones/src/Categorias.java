
//Sistema de adminsitración de cateogrías
//CRUD Create-read-update-delete
import java.util.ArrayList;
import java.util.Scanner;

public class Categorias {
	public static ArrayList<String> lista = new ArrayList<String>();

//  public static Scanner sc;
	public static void main(String[] args) {
		char opcion;
		String mensaje;
		String categoria;
		lista.add("Adventure");
		lista.add("Fantasy");
		lista.add("Animation");
		// sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("==================");
			System.out.println("Escribe la letra de la acción a realizar");
			System.out.println("(C) para crear");// 
			System.out.println("(R) para buscar");// 
			System.out.println("(U) para actualizar");// 
			System.out.println("(D) para borrar");
			System.out.println("(X) para salir");
			System.out.print("> ");
			String comando = sc.nextLine();
			opcion = (comando.length() == 0) ? opcion = ' ' : comando.toUpperCase().charAt(0);
			switch (opcion) {
			case 'C':
				System.out.println("Crear");
				System.out.println("Escribe la categoría que deseas agregar: ");
				categoria = sc.nextLine().trim();
				mensaje = (agregarCategoria(categoria)) ? "Se agregó la categoría correctamente":"No se pudo agregar la categoría";
				System.out.println(mensaje);
				break;
			case 'R':
				System.out.println("Buscar");
				mostrarTodos();
				break;
			case 'U':
				System.out.println("Actualizar");
				System.out.println("Escribe la categoría actual: ");
				String anterior = sc.nextLine().trim();
				System.out.println("Escribe la categoría nueva: ");
				String nueva = sc.nextLine().trim();
				mensaje = (actualizarCategoria(anterior, nueva)) ? "Se actualizó la categoría correctamente":"No se pudo actualizar la categoría";
				System.out.println(mensaje);
				break;
			case 'D':
				System.out.println("Borrar");
				System.out.println("Escribe la categoría que deseas borrar: ");
				categoria = sc.nextLine().trim();
				mensaje = (borrarCategoria(categoria)) ? "Se borró la categoría correctamente":"No existe la categoría";
				System.out.println(mensaje);
				break;
			case 'X':
				System.out.println("Salir");
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}// switch
		} while (opcion != 'X');
		sc.close();

	}// main
	
	public static boolean actualizarCategoria(String actual, String nueva) {
		boolean res = false;
		
		int indice = lista.indexOf(actual);
		if (indice != -1 && nueva.trim().length()>3 && !lista.contains(nueva)) {
			lista.set(indice, nueva);
			res = true;
		}
		
		return res;
	}// actualizarCategoria
	
	
	public static boolean borrarCategoria(String categoria) {
		return lista.remove(categoria);
	}// borrarCategoria

	public static boolean agregarCategoria(String categoria) {
		boolean res = false;
		if (categoria.length() > 2) {
			if (!lista.contains(categoria)) {
				lista.add(categoria);
				res = true;
			} 
		} 
		return res;
	}// agregarCategoria

	public static void mostrarTodos() {
		System.out.println("++++++++ Categorías +++++++++");
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	}// mostrarTodos

}// class Categorias

//Adventure
//Fantasy
//Animation
//Drama
//Horror
//Action
//Comedy
//History
//Western
//Thriller
//Crime
//Documentary
//Science Fiction
//Mystery
//Music
//Romance
//Family
//War
//Foreign
//TV Movie
