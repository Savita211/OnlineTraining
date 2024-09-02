package javaPackage;

public class TypeCastingnarrowing {

	public static void main(String[] args) {
		double b = 5.5;
		int a = (int)b;
		
		System.out.println(b);
		System.out.println(a);
		
		//convert string to integer 
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		//integer to string 
		int z = 5;
		String t= String.valueOf(z);
		System.out.println(t.length());
		System.out.println(t);
	}
}
