
public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Short.BYTES);
		System.out.println(Short.SIZE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.BYTES);
		System.out.println(Long.SIZE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Float.BYTES);
		System.out.println(Float.SIZE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.BYTES);
		System.out.println(Double.SIZE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		double pi = 3.1415;
		float pi2 = 3.1415F;
		long lolo = 51531;
		
		Float number = Float.valueOf("3.1");
		Float number1 = Float.valueOf(4.2F);
		Float number2 = Float.valueOf((float)5.2);
		
		int tmpNum = number.intValue();
		System.out.println(number.doubleValue());
		
		Integer numero3 = Integer.valueOf(777);
	}

}
