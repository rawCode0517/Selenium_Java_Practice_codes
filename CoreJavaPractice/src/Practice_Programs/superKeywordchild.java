package Practice_Programs;

public class superKeywordchild extends superKeywordParent {
	
	public superKeywordchild() {
//		super();
		System.out.println("I am the child constructor");
	}
	String b ="jenamani";
	
	public void getString() {
		
		System.out.println(b);
		System.out.println(super.b);
	}
	public void getData() {
		super.getData();
		System.out.println(" I am child class");
	}
	
	public static void main(String[] args) {
		
		superKeywordchild cd = new superKeywordchild();
	
		cd.getString();
		cd.getData();
		
		
	}
}
