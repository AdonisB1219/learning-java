import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> autos = new HashSet<String>();
		autos.add("Volvo");
		System.out.println(autos.add("BMW"));
		System.out.println(autos.add("Ford"));
		System.out.println(autos.add("BMW"));
		System.out.println(autos.add("Audi"));
		System.out.println("VW");
		System.out.println(autos.size());
		System.out.println(autos.isEmpty());
		System.out.println(autos.contains("BMW"));
		
		for (String auto : autos) {
			System.out.println(auto);
		}
		
		autos.forEach(auto->{System.out.println(auto);
			auto += "s";}
		);
		
		


	}

}
