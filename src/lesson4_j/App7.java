package lesson4_j;

public class App7 {
	public static void main(String[] args) {
		App7 application = new App7();
		application.firstMethod();
	}
	
	public void firstMethod() {
		System.out.println("start first");
		secondMethod();
		System.out.println("end first");
	}
	
	private void secondMethod() {
		System.out.println("start second");
		System.out.println("end second");
	}
}
