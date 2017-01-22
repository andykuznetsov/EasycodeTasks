package lesson5_j;

import java.awt.*;

public abstract class ColorShape {
	private Color shapeColor;
	
	public Color getShapeColor() {
		return shapeColor;
	}
	
	public void setShapeColor(Color shapeColor) {
		if(!shapeColor.equals(Color.black)) {
			this.shapeColor = shapeColor;
		} else {
			System.out.println("wrong");
		}
	}
	
	public abstract void printMyColor();
}
