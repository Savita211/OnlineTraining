package javaPackage;

public class Static6 {
	
	int x=10;//global variable
	static int y= 5;//static variable
	
	//non static method
	public void a() {
		int z = 10;
		System.out.println(z);
	}
	
	static int b = 6;//static variable
	
	//static method
	public static void b() {
		int a = 5;//local variable
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Static6 s6 = new Static6();
		s6.a();//by creating an object we can call non static methods
		System.err.println(s6.b);// not appropriate way
		System.out.println(Static6.b);// not appropriate way
	System.out.println(b);//we can call static methods directly in main method, 
	System.out.println(s6.x);
	System.out.println(y);
	}
	

}
