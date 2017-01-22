package lesson5_j;


import org.w3c.dom.css.Rect;

public class App3 {
	
	public static void main(String[] args) {
		Rectangle myRect = new Square(0,0,5);
		
		
		
		
		myRect.rectMethod();
		
		handleOfRectangles(new Square(0,0,10));
		handleOfRectangles(new Rectangle(0,0,10,10));
	}
	
	public static void handleOfRectangles(Rectangle rectToHandle) {
		System.out.println(rectToHandle);
	}
}
