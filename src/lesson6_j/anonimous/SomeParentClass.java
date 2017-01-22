package lesson6_j.anonimous;

public class SomeParentClass {
	int x = 6;
	int y = 10;
	
	public SomeParentClass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public SomeParentClass(int var) {
		this.x = var;
		this.y = var;
	}
	
	public void doSmth(){
		System.out.println("in parent");
	}
}
