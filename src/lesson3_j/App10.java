package lesson3_j;

import java.util.Arrays;

public class App10 {
	
	public static void main(String[] args) {
		int sourceArray [] = new int[]{465,54,1,2,6,7,1,2,3,4,5,0,-4,-8,0,7};
		
		int temp;
		for(int i = 0; i < sourceArray.length; i++) {
			for(int j = 0; j < sourceArray.length - i - 1; j++) {
				if(sourceArray[j] > sourceArray[j+1]) {
					temp = sourceArray[j];
					sourceArray[j] = sourceArray[j+1];
					sourceArray[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(sourceArray));
		
	}
}
