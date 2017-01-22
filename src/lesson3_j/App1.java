package lesson3_j;

import java.io.IOException;
import java.util.Arrays;

public class App1 {
	public static void main(String[] args) throws IOException {
		int []integerArray = {10,241,24,15,44,2,1,5,4,7,8,45};
		
		for(int arrayIndex = 0; arrayIndex<integerArray.length; arrayIndex++) {
			System.out.print(integerArray[arrayIndex] + " ");
		}
		
		System.out.println(Arrays.toString(integerArray));



		
	}
	
}
