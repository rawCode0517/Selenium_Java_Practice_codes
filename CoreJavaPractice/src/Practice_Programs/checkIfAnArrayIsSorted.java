package Practice_Programs;

public class checkIfAnArrayIsSorted {

	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5,6,7};
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>arr[i-1]) {
				System.out.println("Array is Sorted");
			}else {
				System.out.println("Array is not sorted");
			}
			System.out.println("the arrays are "+arr[i]);
		}
		
		
	}
	
	
	
	
	
}
