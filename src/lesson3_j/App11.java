package lesson3_j;

import java.util.Arrays;
import java.util.Random;

public class App11 {
	
	public static void main(String[] args) {
		double randomArray[] = new double[7];
		Random generator = new Random();
		for(int index = 0; index < randomArray.length; index++) {
			randomArray[index] = Math.random();
		}
		
		System.out.println(Arrays.toString(randomArray));
		
	}
	
	
	
}
