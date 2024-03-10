
public class MultiplesSeparadores {

	public static void main(String[] args) {
		String str = "apples - 9 ; 1";
		String[] arr = str.split("[\\W]+");
		for(String s : arr) {
			System.out.println(s);
		}

	}

}
