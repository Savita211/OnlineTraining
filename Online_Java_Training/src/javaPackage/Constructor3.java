package javaPackage;

public class Constructor3 {

	//constructor overloading
	Constructor3(){
		System.out.println("no paramter");
	}
   Constructor3(int a){
		System.out.println("int parameter");
	}
   Constructor3(String b){
	System.out.println("String parameter");
   }
     
   public static void main(String[] args) {
	Constructor3 c3 = new Constructor3();
	Constructor3 c4 = new Constructor3(1);
	Constructor3 c5 = new Constructor3("savita");
 }
	
}
