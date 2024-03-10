
public class Tokens {

	public static void main(String[] args) {
		String s = "";
        String[] strings = s.split("[^A-Za-z]+");
        System.out.println(strings.length);
        for(String a:strings){
            System.out.println(a);
        }

	}

}
