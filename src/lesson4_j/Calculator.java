package lesson4_j;

public class Calculator {
	
	public long calculateSumOfNumbers(int number1, int number2)
			throws IllegalArgumentException {
		return number1 + number2;
	}
	
	public int calculateSumOfNumbers(int number1, double number2) {
		return (int)(number1 + number2);
	}
	
	
}
