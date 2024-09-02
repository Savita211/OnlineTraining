package javaPackage;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) {
		Hashtable<Integer, String> m = new Hashtable<Integer, String>();
		m.put(1,"jan");
		m.put(2,"feb");
		m.put(3, "march");
		
		System.out.println(m.get(1));
		System.out.println(m.get(2));
		System.out.println(m.get(3));
		
		System.out.println(m);
	}
}
