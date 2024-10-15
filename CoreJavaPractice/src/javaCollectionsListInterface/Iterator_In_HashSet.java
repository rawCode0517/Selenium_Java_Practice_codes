package javaCollectionsListInterface;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_In_HashSet {
	
	
	public static void iteratorExample() {
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
		
		
		//Iterator helps in travesring in a set interface//
		Iterator<String> i = hs.iterator();//initializing iterator
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());//this prints true as next index value is present
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.hasNext());//this prints false as next index is not present in the set
		
		//printing statement one by one becomes hectic when there are 100 values. So we will use iterator in another way
		//How will I print the value present in the 97th index in a set?
		//I will use while loop  with iterator. I will use hasNext()
		
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		iteratorExample();
	}
}
