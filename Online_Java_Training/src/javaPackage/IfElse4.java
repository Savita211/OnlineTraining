package javaPackage;

//nestedif
public class IfElse4 {
	
	public static void main(String[] args) {
		int age = 15;
		int weight = 55;
		
		//outer if 
		if(age > 18)
		{
			//inner if 
			if(weight > 50) {
				System.out.println("eligible");
			}else {
				System.out.println("not eligible");
			}
		}else {
			System.out.println("age is not greater than 18");
		}
		}

}
