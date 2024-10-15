package javaCollectionsListInterface;

import java.util.HashSet;

public class Set_HashSet {

	//Set interface does not include/accept duplicate values
	//Set interface does not follow the order
	
	
	public static void hasSetExample() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("beat");
		hs.add("polo");
		hs.add("figo");
		hs.add("thar");
		hs.add("taigun");
		hs.add("figo");//duplicate values
		System.out.println(hs);
		hs.remove("polo");
		System.out.println(hs);
		System.out.println(hs.size());	
	
	
	
	
	}
	
	
	public static void main(String[] args) {
		hasSetExample();
		
	}
	
	
}
