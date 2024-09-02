package javaPackage;

public class Array4 {
	
	public static void main(String[] args) {
		//defining multi dimensional array
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		//total no of rows
		int row = a.length;
		System.out.println(row);
		
		//total no of columns
		int columns = a[0].length;
		System.out.println(columns);
		
		//print all values in matrix form
		for(int i =0; i<row; i++) {
			for(int j=0; j<columns; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
