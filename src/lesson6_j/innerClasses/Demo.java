package lesson6_j.innerClasses;

public class Demo {
	
	public static void main(String[] args) {
		Outer outerObject = new Outer(5);
		
		Outer.Inner myInner1 = outerObject.new Inner();
		Outer.Inner myInner2 = outerObject.new Inner();
		Outer.Inner myInner3 = outerObject.new Inner();
		Outer.Inner2 myInner2_2 = outerObject.new Inner2();
		
		
	}
}
