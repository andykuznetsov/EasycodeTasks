package lesson3_j;

import java.io.IOException;

public class App2 {
	public static void main(String[] args) throws IOException {
		int temper[] = {25,28,31,26,33,30,32,24,30,32};
		
		double avg;
		int sum = 0;
		int n = temper.length;
		for (int i = 0; i < n; i++) {
			sum += temper[i];
		}
		
		avg = (double)sum / n;
		
		System.out.println("Average value: " + avg);    
		
	}
	
}
