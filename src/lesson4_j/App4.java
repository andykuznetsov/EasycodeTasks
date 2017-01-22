package lesson4_j;

import java.io.IOException;

public class App4 {
	public static void main(String[] args)  {
		System.out.println("method 1");
		main(args, 1);
	}
	
	public static void main(String[] args, int someParam) {
		System.out.println("method 2");
	}
	
}
