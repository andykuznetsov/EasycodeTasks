package lesson2_j;

import java.io.IOException;

public class App1 {
	public static void main(String[] args) throws IOException {
		String greeting = new String("Hello");
		String anotherGreeting = "Привет";
		System.out.println(greeting);
		System.out.println(anotherGreeting);
		
		char firstCharacterOfString = greeting.charAt(0);
		System.out.println("Первый символ строки:" + firstCharacterOfString);
		
		int totalLength = greeting.length();
		System.out.println(totalLength);
		
		char someCharacterOfString = greeting.charAt(10);
		System.out.println("Первый символ строки:" +someCharacterOfString);
		
	}
	
}
