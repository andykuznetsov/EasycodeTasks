package lesson5_j;

interface Interface1 {
	int SOME_VAR = 5;
	
	void methodName();
}

interface Interface2 {
	int SOME_VAR = 9;
	
	void methodName();
}

class MyClass implements Interface1, Interface2 {
	
	void someSuperMethod() {
		System.out.println(Interface1.SOME_VAR);
		System.out.println(Interface2.SOME_VAR);
	}
	
	public static void main(String[] args) {
		MyClass myclassInstance = new MyClass();
		myclassInstance.someSuperMethod();
		System.out.println(((Interface1) myclassInstance).SOME_VAR);
		System.out.println(((Interface2) myclassInstance).SOME_VAR);
		
		myclassInstance.methodName();
	}
	
	@Override
	public void methodName() {
		System.out.println("some action");
	}
}







