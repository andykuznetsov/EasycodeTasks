package lesson3_j;

public class App5 {
	public static void main(String[] args) {
		
		int array1D[] = new int[] {1,2,3};
		
		int matrixA[][] = new int[][] {{1,2,3}, {1,2,3}};
		
		for (int i = 0; i < matrixA.length; i++) {
			for (int j = 0; j < matrixA[i].length; j++) {
				System.out.print(matrixA[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
}
