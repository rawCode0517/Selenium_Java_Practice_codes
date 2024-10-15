package javaCollectionsListInterface;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class hashMap_highestPriceProgram {

	//Create a hashmap to store the product and their prices
	
	public static void main(String[] args) {
		
		findMaximumPriceOfProduct();	
		
	}
	
	public static void findMaximumPriceOfProduct() {
		
		String []product = {"iphone","Galaxy","pixel 4","iphone 8"};
		int[]prices = {700,650,899,284};
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		//for loop to add all the product to hashmap
		
		for(int i=0;i<product.length;i++) {
			map.put(product[i], prices[i]);
			
		}	
		System.out.println(map);
	
	//Find product using collection method called max
	Map.Entry<String, Integer> expensiveProduct = Collections.max(map.entrySet(), Map.Entry.comparingByValue());
	
	System.out.println(expensiveProduct.getKey()+" with price "+ expensiveProduct.getValue());
	}
	
}
