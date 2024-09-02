package javaPackage;

public class Array1 {
	
	public static void main(String[] args) {
		
		//declaring an array
		int a[] = new int[5];
		
		//printing the length of array
		System.out.println(a.length);
		
		//print default value of array
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		//assigning value to array
		a[0]=65;
		a[1]=23;
		a[2]=56;
		a[3]=14;
		a[4]=19;
		//a[5]=5;//array index outof bound exception
		
		System.out.println(a[3]);
		
		//print all array elements
				for(int i=0; i<a.length;i++) {
					System.out.println(a[i]);
				}
	}

}
