package Practice_Programs;

public class Test {
	
	public static void main(String[] args) {
		Test a = new Test();
		a.smallestIntArrayLargestInt();
	}

	public void smallestIntArrayLargestInt() {
		
		
		//Steps to solve it
//		1. Find the minimum number
//		2. Identify the coloumn of minimum number
//		3. Find the maximum number in identified column
//		
		
		
		
		int [][]a = {{6,9,19},{6,8,1},{4,9,8}};
		int small=a[0][0];//considering first value as minimum no
		int count=0;
		int intColumn=0;
		for(int i=0;i<3;i++) {
			for(int j =0; j<3;j++) {
				if(a[i][j]<small) {
					small=a[i][j];
					intColumn = j;
				}
			}
		}
		System.out.println(small);
		System.out.println(intColumn);
		int maxNum=a[0][intColumn];
		int k=0;
		
		while(k<3) {
			if(a[k][intColumn]>maxNum) {
				maxNum = a[k][intColumn];
			}
			k++;
		}
		
		System.out.println(maxNum);
		
		
		
		
		
		
	}
	
	
}
