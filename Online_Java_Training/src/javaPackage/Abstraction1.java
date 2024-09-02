package javaPackage;

public abstract class Abstraction1 {
        
	static int a = 5;
	int b = 5;
	final int c = 10;
	
	//abstract method :- no body
	abstract void eat();
	
	//non abstract method
	public void a(){
		System.out.println("non abstract method");
	}
}
