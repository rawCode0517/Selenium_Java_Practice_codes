package Practice_Programs;

public class understandingStaticKeyWord {

	String name; //these are all called instance variable or class level variables declared and can be accessed by any method present in the current class
	static String address;
	static String city ="Balugaon";
	static int val =0;
	
	public understandingStaticKeyWord(String name , String address){
		this.name = name;
		this.address = address;
		val++;
		System.out.println(val);
	
	}
	
	public void getData() {
		System.out.println(address+" "+city);
		
	}
	
	 
	public static void	getAddress() {
		System.out.println(address);
	}
	
	public static void main(String[] args) {
		
		//creating an object of same class
		understandingStaticKeyWord k = new understandingStaticKeyWord("Manu","Marathalli");
		understandingStaticKeyWord k1 = new understandingStaticKeyWord("Janu","Vijyanagram");
		k.getData();
		k1.getData();
		understandingStaticKeyWord.getAddress();
		
		
		
		
	}

}
