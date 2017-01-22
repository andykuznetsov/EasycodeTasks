package lesson2_j;

import java.io.IOException;

public class App5 {
	public static void main(String[] args) throws IOException {
		String word1 = "someword";
		
		String word2 = new String("someword");
		
		String word3 = "someword";
		
		System.out.println("Expected true: " + (word1 == word3));
		System.out.println("Expected false: " + (word1 == word2));
		System.out.println("Expected false: " + (word3 == word2));
	}
	
}
