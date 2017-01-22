package lesson4_j;

public class NewClass {
	
	int value;
	String stringValue = "someValue1";
	
	{
		System.out.println("first");
	}
	{
		System.out.println("second");
	}
	{
		System.out.println("third");
	}
	
	static {
		System.out.println("static block!");
	}
	
	public NewClass() {
		System.out.println(stringValue);
	}
	
	public NewClass(int initialParamValue) {
		this(initialParamValue, 52.1);
	}
	
	public NewClass(int initParamValue, double doubleValue) {
		System.out.println("Two");
	}
	
	
	
}
