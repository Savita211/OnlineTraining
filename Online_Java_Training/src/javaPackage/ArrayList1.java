package javaPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		//creating arraylist
		ArrayList<Object> obj = new ArrayList();
		
		//adding object in arraylist
		obj.add(1);
		obj.add("selenium");
		obj.add(7.8);
		obj.add('a');
		obj.add(3>12);
		
		//print arraylist - 1st way
		System.out.println(obj);
		
		//2nd way-using for each loop
		for(Object bcd : obj) {
			System.out.println("for each loop : bcd");
		}
		
		//using loop
		Iterator abc = obj.iterator();
        while(abc.hasNext()) {
        	System.out.println("while loop: "+abc.next());
        }
		}
}
