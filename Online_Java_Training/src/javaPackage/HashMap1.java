package javaPackage;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1,"jan");
		m.put(2,"feb");
		m.put(3, "march");
		
		System.out.println(m.get(1));
		System.out.println(m.get(2));
		System.out.println(m.get(3));
		
		System.out.println(m);
	}
}
