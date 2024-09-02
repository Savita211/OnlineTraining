package javaPackage;

public class Static3 {
	
	int roll;//declaring global variable
	String name;//declaring global variable
	static String college = "IIT bombay";
	
	//constructor
	Static3(int r, String n){
		roll = r;
		name = n;
		}
	
	public void getResult() {
		System.out.println(roll+" "+name+" "+college);
	}

}
