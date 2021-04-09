package sample1;

public class Multiplication {
	
	public static void main(String args[]) {
		displayMultiplication();
	}
	
	static void displayMultiplication() {
		
		int[][] matrix = new int[13][13];
		String space = " ";
		
		for(int i=1;i<=12;i++) {
			matrix[0][i] = i;
			matrix[i][0] = i;
			for(int j = 1;j<=12;j++) {
				matrix[i][j] = i*j;
			}
			
		}
		
		for( int[] row : matrix) {
			for(int element : row) {
				System.out.print(element+space);
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
