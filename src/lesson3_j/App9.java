package lesson3_j;

import java.util.Arrays;

public class App9 {
	
	public static void main(String[] args) {
		int sourceArray [] = new int[]{465,54,1,2,6,7,1,2,3,4,5,0,-4,-8,0,7};
		
		System.out.println("Before: " + Arrays.toString(sourceArray));
		Arrays.sort(sourceArray);
		System.out.println("After: " + Arrays.toString(sourceArray));
		
	}
}
