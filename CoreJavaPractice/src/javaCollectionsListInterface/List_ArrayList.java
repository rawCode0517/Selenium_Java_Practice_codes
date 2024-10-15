package javaCollectionsListInterface;

import java.util.ArrayList;

public class List_ArrayList {

	
	public static void arraylist() {
		
		ArrayList<String> a = new ArrayList<String>();//need to add type argument for array list.
		a.add("rahul");
		a.add("ajay");
		a.add("vijay");
		System.out.println(a);
		a.add(3, "gopi");
		a.add(4,"julia");
		System.out.println(a.size());
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		System.out.println(a.size());
		a.remove("julia");
		a.add("paul");
		a.add("paul");
		System.out.println(a.size());
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("vijay"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}
	
	public static void main(String[] args) {
		
		arraylist();
		arraylistExercise();
		
		
		
		
		
	}
	
	public static void arraylistExercise() {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("apple");
		a.add("banana");
		a.add("cherry");
		a.add("mango");
		a.add("cherry");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		System.out.println(a.contains("orange"));
		if(a.contains("orange")) {
			System.out.println("Orange is found");
		}else {
			System.out.println("Orange is not found in the array list");
		}
		System.out.println(a.size());
		
		for(int i=0;i<a.size();i++) {
			 System.out.println("Index : "+i+", value: "+a.get(i));
		}
		
	
	}
}
