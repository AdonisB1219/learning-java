
public class MatrizDemo {
	public static void main(String[] args) {
		int matriz [][] = {
				{1, 2, 3, 4, 5},
				{6,7,8,9,10},
				{11,12,13,14}
				
		};//matriz
		
		for(int[] elemento: matriz) {
			for(int e: elemento) {
				System.out.print(e + ", ");
			}
			System.out.println();
		}
	}//main


}//class MatrizDemo
