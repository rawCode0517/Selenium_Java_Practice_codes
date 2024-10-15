package Practice_Programs;

public class PS2 extends PS3 {
	int a;//class variable/Global variable
	
	public PS2(int a) {
		//the variable which is passed in this constructor is known as instance variable
		//this keyword is used to call current class variable
		super(a);
		this.a=a;
		
		
	}
	
	public int increment() {
		a=a+1;
		return a;
	}
	public int decrement() {
		a=a-1;
		return a;
		
	}
	
	
}
