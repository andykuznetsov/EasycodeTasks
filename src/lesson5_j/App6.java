package lesson5_j;

public class App6 {
	
	public static void main(String[] args) {
		
		draw(new Square(0,0,5));
		draw(new Rectangle(0,0,5,7));
		
	}
	
	
	public static void draw(Object shape) {
		if(shape instanceof Square) {
			System.out.println("Draw square");
		} else if(shape instanceof Rectangle) {
			System.out.println("Draw rectangle");
		}
		
	}
	
}
