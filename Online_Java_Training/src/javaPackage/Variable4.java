package javaPackage;

public class Variable4 {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};//integer type array
		String s[]= {"savita","meti"};//string type array
		System.out.println(a[4]);//5
		System.out.println(s[0]);//savita
		
		Object c[] = {1,2,3,"savita", "meti",'s','f', 3>12};//object array
		System.out.println(c[4]);//meti
		System.out.println(c[5]);//s
		System.out.println(c[7]);//false
	}

}
