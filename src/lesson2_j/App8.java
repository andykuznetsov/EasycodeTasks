package lesson2_j;

import java.io.IOException;

public class App8 {
	public static void main(String[] args) throws IOException {
		
		String s1 = "abc", 
				s2 = "ab";
		boolean flag = (s1 == "abc");
		System.out.println(flag);
		flag = ((s1 + "") == "abc");
		System.out.println(flag);
		flag = ((s1 +"").intern() == "abc");
		System.out.println(flag);
		flag = (s1 == "ab" + "c");
		System.out.println(flag);
		flag = (s1 == s2 + "c");
		System.out.println(flag);
		flag = (s1 == (s2).intern());
		System.out.println(flag);
	}
}
