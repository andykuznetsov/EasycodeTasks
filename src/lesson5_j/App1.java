package lesson5_j;

class Rectangle extends ColorShape implements Shape {
	
	int x, y;
	
	public double width, height;
	
	public Rectangle(int x, int y, double width, double height) {
		System.out.println("I'm in rectangle");
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void rectMethod() {
		System.out.println("Rect method");
	}
	
	public double calculateAreaOfShape() {
		return width*height;
	}
	
	@Override
	public void printMyColor() {
		System.out.println(getShapeColor());
	}
}

class Square extends Rectangle {
	public Square(int x, int y, double size) {
		super(x, y, size, size);
		System.out.println("I'm in square");
	}
	
	public void squareMethod() {
		System.out.println("Square method");
	}
}


public class App1 {
	
	public static void main(String[] args) {
		Square mySquare1 = new Square(0,0,10);
		Square mySquare2 = new Square(0,0,10);
		System.out.println(mySquare1.equals(mySquare2));
	}
}
