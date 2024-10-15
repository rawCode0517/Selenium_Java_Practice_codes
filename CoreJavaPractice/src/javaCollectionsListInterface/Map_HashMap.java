package javaCollectionsListInterface;

import java.util.HashMap;
import java.util.Set;

public class Map_HashMap {

	
	public static void hashMapExample() {
		
		HashMap<Integer,String> hp = new HashMap<Integer,String>();//need to add type argument
		hp.put(0, "skoda");
		hp.put(1, "VW");
		hp.put(42, "chevrolet");
		hp.put(3, "audi");
		hp.put(4, "BMW");
		System.out.println(hp.get(2));
		hp.remove(42);
		System.out.println(hp);
		Set<?>  sn= hp.entrySet();
		
	}
	
	
	public static void main(String[] args) {
		hashMapExample();
	}
	
	
}
