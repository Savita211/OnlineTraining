package javaPackage;

public class Static1 {

	int x = 100;//global variable
	String s = "hello";
	static int y = 100;
	
	//static method
	public static void method1() {
		String x = "hi";
		System.out.println(x);
	}
	
	//non static method
	public void method2() {
		int i = 100;
	}
	
}
