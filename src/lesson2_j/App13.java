package lesson2_j;

import java.io.IOException;

public class App13 {
	public static void main(String[] args) throws IOException {
		String firstStr = "Hello";
		String newString = firstStr.replace('l', '!');
		System.out.println(firstStr);
		System.out.println(newString);
	}
}
