package Practice_Programs;

public class tryCatchPractice {
	int x=10;
	int y=0;
	int z;
	
	public void arithmeticException(){
		
		try{
			z=x/y;
		}
		
		catch(ArithmeticException e) {
			System.out.println("I Caught arithmetic exception so check again");
		}
		catch(Exception e) {
			System.out.println("Exception is related to arithmetic check again");
		}
		
		
	}
	
	public void arrayException() {
		
		
		try {
			int [] b = new int[4];
			
			System.out.println(b[5]);
		}catch(ArithmeticException e) {
			System.out.println("I catch arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException et){
			System.out.println("Array out of bound exception");
		}
		catch (Exception e) {
			System.out.println("Exception is handled by Exception class itself");
		}
		
		
		
	}
	
	public static void main(String[] args) {
	
		tryCatchPractice ab = new tryCatchPractice();
		ab.arithmeticException();
		ab.arrayException();
	}
	
	
	
	
	
}
