package lesson2_j;

import java.io.IOException;

public class App16 {
	public static void main(String[] args) throws IOException {
//		System.out.printf("This is some my %3$d parameter", 10, 20, 30, 40);
//		System.out.printf("This is some my %d %d %d %d parameter", 10, 20, 30, 40);
		System.out.printf("This is some my %1$-20d %(d %,d %d parameter", 10, -20, 30000000, 40);
	}
}
