package lesson2_j;

import java.io.IOException;
import java.util.Scanner;

public class App17 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите высоту: ");
		int height = sc.nextInt();
		for(int currentLevel = 0; currentLevel < height; currentLevel++) {
			for(int countOfSpaces = 0; countOfSpaces < height - currentLevel - 1; countOfSpaces++) {
				System.out.print(' ');
			}
			for (int countOfStars = 0; countOfStars < currentLevel*2+1; countOfStars++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
