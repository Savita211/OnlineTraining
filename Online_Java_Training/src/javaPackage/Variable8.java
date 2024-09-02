package javaPackage;

public class Variable8 {
	
	int b = 10;//global variable
	static int c = 3;//static variable
	
	public static void main(String[] args) {
		int a = 6;//local variable
		System.out.println(a);
		System.out.println(c);
		//static number calling
		b();//if we r calling static no from same class we can call directly
		//if we r calling from dfferent class we can call by method name r variable name
	
		//non static member calling
		Variable8 v8 = new Variable8();
		System.out.println(v8.b);
		v8.f();
		
	}
	
	//static method
	public static void b() {
		int e = 6;
		System.out.println(e);
	}
	
	//non static method 
	public void f() {
		int f = 5;
		System.out.println(f);
	}
	

}
