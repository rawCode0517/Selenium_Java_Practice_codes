package Practice_Programs;

public class constructor {
	
	//default constructor is hidden
	
	 public constructor() {
		System.out.println("This is not a hidden constructor");
	}
	
	//parametrized constructor
	public constructor(int a ,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public constructor(String a, String b){
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		
		constructor ac= new constructor();
		constructor c= new constructor(6,7);
		constructor ae= new constructor("ansu","man");
		
		
		
		
	}
	
	
}
