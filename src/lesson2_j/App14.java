package lesson2_j;

import java.io.IOException;
import java.util.StringTokenizer;

public class App14 {
	public static void main(String[] args) throws IOException {
		String someText = "Мама мыла раму.";
		StringTokenizer myTokenizer = new StringTokenizer(someText);
		while(myTokenizer.hasMoreElements()) {
			System.out.print(myTokenizer.nextElement());
		}
		
	}
}
