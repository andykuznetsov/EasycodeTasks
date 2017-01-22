package lesson6_j.anonimous;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		SomeActionInterface myImpl = new SomeActionInterface() {
			public int doSomeActionAndGetResult() {
				System.out.println("method inside of interface");
				return 100;
			}
		};
		
		int result = myImpl.doSomeActionAndGetResult();
		System.out.println("result: " + result);
		
		Date firstBoxDate = new Date(2017,01,01);
		Date secondBoxDate = new Date(2017,01,03);
		
		Arrays.sort(new Box[]{new Box(firstBoxDate), new Box(secondBoxDate)}, new Comparator<Box>() {
			@Override
			public int compare(Box o1, Box o2) {
				return 0;
			}
		});
	}
	
	
}
