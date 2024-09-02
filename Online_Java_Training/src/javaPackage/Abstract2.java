package javaPackage;

public class Abstract2 extends Abstraction1{

	void eat() {
		System.out.println("please eat");
	}
	
	public static void main(String[] args) {
		Abstract2 a2 = new Abstract2();
		a2.eat();
		a2.a();
	}

	
}
