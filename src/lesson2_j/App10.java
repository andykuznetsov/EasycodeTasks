package lesson2_j;

import java.io.IOException;

public class App10 {
	public static void main(String[] args) throws IOException {
		byte[] bytes = "HELLO".getBytes("UTF-8");
		String str = new String (bytes, "UTF-16");
		System.out.println(str);
		
	}
}
