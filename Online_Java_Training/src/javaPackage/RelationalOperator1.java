package javaPackage;

public class RelationalOperator1 {
	
	public static void main(String[] args) {
		int a = 100;
		int b = 100;
		
		if(a!=b) {
			System.out.println("a is not equalto b");
		}else {
			System.out.println("a is equalto b");
		}
		
		String p = "Hello";
		String q = "hello";
		
		//string comparison case sensitive
		if(p==q) {
			System.out.println("p is equalto q in 1st way");
		}else{
			System.out.println("p is not equalto q in 1st way");
		}
		
		//case sensitive
		if(p.equals(q)) {
			System.out.println("p is equalto q in 2nd way");
		}else {
			System.out.println("p is not equalto q in 2nd way");
		}
		
		//non case sensitive
		if(p.equalsIgnoreCase(q)){
			System.out.println("p is equalto q in 3rd way");
		}else {
			System.out.println("p is not equalto q in 3rd way");
		}
	}

}
