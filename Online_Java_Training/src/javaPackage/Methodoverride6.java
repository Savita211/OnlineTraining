package javaPackage;

public class Methodoverride6 extends Methodoverride5{
	
	public void cook() {
		System.out.println("mom is cooking");
	}

	public void angry() {
		System.out.println("father is angry");
	}
	
	public static void main(String[] args) {
		Methodoverride6 n6 = new Methodoverride6();
		n6.eat();
		n6.cook();
		n6.angry();
		n6.handwash();
	}

}
