package lesson6_j.anonimous;

public class Main2 {
	
	public static void main(String[] args) {
		
		SomeParentClass myImpl = new SomeParentClass(5) {
			public void doSmth() {
				System.out.println("in child");
			}
		};
		
		myImpl.doSmth();
		
	}
	
	
}
