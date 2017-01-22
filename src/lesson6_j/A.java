package lesson6_j;

public class A {
	
	public int x;
	
	private class B {
		public void innerMethod() {
			A.this.x = 5;
		}
	}
}
