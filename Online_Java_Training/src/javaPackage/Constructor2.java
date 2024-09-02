package javaPackage;

public class Constructor2 {

	int id;
	String name;
	String address;
	
	//Default constructor
	Constructor2(){
		System.out.println("Hello default constructor");
	}
	
	//parameterized constructor
	Constructor2(int a, String b, String c){
		this.id=a;
		this.address=c;
		this.name=b;
	}
	
	public void displayInfo()
{
		System.out.println(id+" "+name+" "+address);
		}
	
	public static void main(String[] args) {
		//default
		Constructor2 c2 =new Constructor2();
		
		//parameterizes
		Constructor2 c3 =new Constructor2(1, "john","uk");
		c3.displayInfo();
		Constructor2 c4 =new Constructor2(2,"savita","dk");
		c4.displayInfo();
	}
}
