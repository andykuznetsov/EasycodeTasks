package lesson2_j;

import java.io.IOException;

public class App15 {
	public static void main(String[] args) throws IOException {
		StringBuffer myNewBuffer = new StringBuffer();
		System.out.println("\'" + myNewBuffer + "\'");
		System.out.println("Before append");
		System.out.println(myNewBuffer.length());
		System.out.println(myNewBuffer.capacity());
		
		myNewBuffer.append("hello");
		System.out.println("After append");
		System.out.println(myNewBuffer.length());
		System.out.println(myNewBuffer.capacity());
		
		
		System.out.println("After second append");
		myNewBuffer.append("qwertyuiop[]asdfghjkl;'zxcvbnm,./");
		System.out.println(myNewBuffer.length());
		System.out.println(myNewBuffer.capacity());
		
		System.out.println(myNewBuffer);
		
		myNewBuffer.delete(5, 15);
		System.out.println(myNewBuffer);
		
		
	}
}
