package lesson6_j.innerClasses;

public class Outer {
	
	private Inner inner;
	private int x;
	
	public Outer(int x) {
		this.x = x;
		this.inner = this.new Inner();
	}
	
	static void method() {
	}
	
	class Inner implements Comparable {
		@Override
		public int compareTo(Object o) {
			return 0;
		}
	}
	
	class Inner2 implements Comparable {
		@Override
		public int compareTo(Object o) {
			return 0;
		}
	}
	
}
