package lesson3_j;

import java.util.Arrays;

public class App8 {
	
	public static void main(String[] args) {
		int sourceArray [] = new int[]{1,2,3,4,5,6,7,8,9,0};
		
		int destinationArray[] = new int[10];
		
		System.arraycopy(sourceArray, 0, destinationArray, 0, 20);
		
		System.out.println("Dest: " + Arrays.toString(destinationArray));
	}
}
