package lesson2_j;

import java.io.IOException;

public class App9 {
	public static void main(String[] args) throws IOException {
		String str1 = "Hello";
		String str2 = new String("Hello");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
	}
}
