package Practice_Programs;

public class arrays {
	
	public static void main(String[] args) {
//		arr();
//		arrLiteral();
//		multiDimensionalArray();
//		printMinimumNumberFromMatrix();
//		printMaximumNumberFromMatrix();
		printMinMaxNo();
	}
	
	public static void arr () {
		int[] a = new int[4];
		a[0]=34;
		a[2]=54;
		a[1]=32;
		a[3]=12;
		a[4]=43;
		a[5]=4;

	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	// Declaring arrays in form of array literal
	}	
	public static void arrLiteral() {
		int sum=0;
		int []b = {3,7,8,05,2,1,6};
		for(int i=0;i<b.length;i++) {
			System.out.println("arrays are "+b[i]);
			sum=sum+b[i];
		}
	System.out.println(sum);
	}
			
	public static void multiDimensionalArray() {
		int [][]a =  new int[2][3];
		a[0][0]=20;
		a[0][1]=23;
		a[0][2]=34;
		
		a[1][0]=65;
		a[1][1]=90;
		a[1][2]=54;
		
//		int [][]k= {{3,4,5},{8,9,10}};
		
//		System.out.println(a[0].length);
//		System.out.println(a[1].length);
		

		for(int i=0;i<2;i++)//outer forloop for row
		{
			for(int j=0;j<3;j++) //inner forloop for column
			{
				System.out.print(a[i][j]+" ");
			}
		
		System.out.println("");
		}			
	}
	
public static void printMinimumNumberFromMatrix()	{
	
	int [][]d = {{2,4,5},{3,4,7},{1,2,9}};
	int min = d[0][0];// here I am considering the first number of the array as minimum number
	for(int i=0;i<3;i++) {
		for(int j=0; j<3;j++) {
			if(d[i][j]<min) {
				min = d[i][j];
			}
		}
	}
	System.out.println(min);
}
	
public static void printMaximumNumberFromMatrix()	{
	
	
	int [][]nums = {{2,4,5},{89,4,7},{1,2,66}};
	int count=nums[0][0];

	for(int i=0;i<3;i++)//running loop for rows 
	{
		for(int k =0;k<3;k++) //running loop for columns
		{
			if(nums[i][k]>count) {
				count = nums[i][k];
			}
		}
	
	}
	
	System.out.println(count);
}
	
public static void printMinMaxNo()	{
	int [][] no= {{0,8,7},{6,1,3},{7,10,3}};
	int count=no[0][0];
	int minimumColumn;
	
	for(int i=0;i<3;i++)//rows 
		{
		for(int j=0;j<3;j++) {
			if(no[i][j]<count)//columns 
				{
				count = no[i][j];
				minimumColumn=j;
			}
		}
	}
	System.out.println(count);
}




	
}
