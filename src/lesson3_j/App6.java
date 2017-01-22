package lesson3_j;

public class App6 {
	public static void main(String[] args) {
		
		int array1D[] = new int[] {1,2,3};
		
		int matrixA[][] = new int[][] {{1,2,3}, {2,4,5}};
		
		for (int i = matrixA.length - 1; i >= 0; i--) {
			for (int j = matrixA[i].length - 1; j >= 0  ; j--) {
				System.out.print(matrixA[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
}
