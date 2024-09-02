package javaPackage;

public class FirstJavaProgram {
	
	int a = 5;//global variable(outside main method inside class)
	static int c = 10;//static variable
	
	//main method
	public static void main(String[] args) {
		System.out.println("savita");
		System.out.println("meti");
		aMethod();
		 bMethod();
		 int b = 5;//local variable(inside main method)
	}
	
	//user defined method
	public static void aMethod() {
		System.out.println("Hello aMethod");
	}
	
	//user defined method
	public static void bMethod() {
		System.out.println("Hello bMethod");
	}
    int d= 10;//local variable
}
