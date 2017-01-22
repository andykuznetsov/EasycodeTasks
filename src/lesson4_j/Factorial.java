package lesson4_j;

public class Factorial {
	
	public static void main(String[] args) {
		Factorial application = new Factorial();
		System.out.println(application.calculateFactorial(3));
	}
	
	public int calculateFactorial(int factValue) {
		if(factValue == 1) {
			return 1;
		} else {
			return calculateFactorial(factValue - 1) * factValue;
		}
	}
	
}
