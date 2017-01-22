package lesson5_j;

public class App7 {
	
	public static void main(String[] args) {
		Shape someShape1 = new Square(0,0,15);
		Shape someShape2 = new Rectangle(0,0,15,5);
		
		System.out.println(someShape1.calculateAreaOfShape());
		System.out.println(someShape2.calculateAreaOfShape());
		
	}
	
	
}
