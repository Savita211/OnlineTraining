package javaPackage;

public class AccesModifier2 extends AccessModifier1{
  
	public static void main(String[] args) {
	AccesModifier2 a2 = new AccesModifier2();
	//System.out.println(a2.a);//private member can not be called outside the class
      System.out.println(a2.b);
	}
	
}
