import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		System.out.println(meses.length);
		meses[0] = "ENERO";
		System.out.println(meses[0]);
		
		int [] nums = new int[5];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		nums = Arrays.copyOf(nums, 6);
		System.out.println(Arrays.toString(nums));
		nums [5] = 6;
		System.out.println(Arrays.toString(nums));

		
		for (int n: nums) {
			System.out.println(n);
		}//foreach nums
		
		}//main

}//class ArraysDemo
