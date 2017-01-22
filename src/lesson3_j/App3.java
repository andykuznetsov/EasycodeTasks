package lesson3_j;

import java.io.IOException;

public class App3 {
	public static void main(String[] args) throws IOException {
		int temper[] = {25,28,31,26,33,30,32,24,30,32};
		
		for (int i = 0; i < temper.length; i++) {
			System.out.print(temper[i] + " ");
		}
		
		System.out.println();
		
		for (int currentElement : temper) {
			System.out.print(currentElement + " ");
		}
		
	}
	
}
