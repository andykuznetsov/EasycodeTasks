package lesson6_j.localClasses;

public class OuterWithLocal {
	
	int x;
	
	public void someMethod() {
		if (x>5) {
			class OnlyInMain {
				public void method() {
					System.out.println(x);
				}
			}
		}
	}
	
}
