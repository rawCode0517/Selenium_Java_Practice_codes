package Practice_Programs;

public class Print1To100NoLoop {

	
	public static void main(String[] args) {
		printNum(1);
		charOccurenceCountInAString();
		sumofDigit();
	}
	
	
	public static void printNum(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
		
	}
	
	public static void charOccurenceCountInAString() {
		
		String val = "practice selenium java";
		//first take count of the string using len function and store it in a variable
		int actualCount =val.length();
		//now replace the repeated character with blank "" using replace function then take count and store it in a variable
		int afterReplace =val.replace("c","" ).length();
		int finalCount = actualCount-afterReplace;
		System.out.println(finalCount);
		
		
	}
	
	public static void sumofDigit() {
		int num = 456;
		int temp =0;
		int sum =0;
		
		while(num>0) {
			temp = num%10;
			sum = sum+temp;
			num = num/10;
		}
		System.out.println(sum);
		
		
		
		
		
	}
	
	
}
