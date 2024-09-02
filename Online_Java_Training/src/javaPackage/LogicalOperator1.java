package javaPackage;

public class LogicalOperator1 {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 5;
		 int c = 20;
		 
		 //logical condition(if first condition false 2nd condition will not check)
		 System.out.println(a<b && a++ <c);//false
		 System.out.println(a);//10
		 
		 //bitwise operator(we check both condition)
		 System.out.println(a<b & a++ <c);//false
		 System.out.println(a);//11
		 
		 
	}

	
}
