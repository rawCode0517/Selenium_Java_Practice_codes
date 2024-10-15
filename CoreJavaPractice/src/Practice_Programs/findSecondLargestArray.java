package Practice_Programs;

public class findSecondLargestArray {

	public static void main(String[] args) {
		
		int [] b= {4,8,10,2,3,9,1};
		//first find the largest number
		int largest = b[0];
		int secondLargest = -1;
		//first find the largest number
		for(int i=0;i< b.length;i++) {
			
			if(b[i]>largest) {
				largest =b[i];
			}
			
		}System.out.println(largest);
		//Lets find the second largest. The logic to find it is:
		//first decalre a variable as second lagest and then comapre it with the largest stored variable
		
		for(int i=0;i<b.length;i++) {
			
			if(b[i]>secondLargest && b[i]!=largest) {
				secondLargest = b[i];
			}
		
		}
		System.out.println(secondLargest);
	
		
	}
	
}
