package lesson2_j;

import java.io.IOException;

public class App11 {
	public static void main(String[] args) throws IOException {
		String firstStr = "Hello";
		
		boolean isPresent = firstStr.contains("llo");
		System.out.println(isPresent);
	}
}
