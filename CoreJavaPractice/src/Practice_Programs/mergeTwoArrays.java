package Practice_Programs;

import java.util.Arrays;

public class mergeTwoArrays {

	public static void main(String[] args) {

		int[] a = { 1, 4, 6, 8 };
		int[] b = { 3, 5, 6, 7 
				};

		int[] c = new int[a.length + b.length];
		// running loop to capture first set of array
		for (int i = 0; i < a.length; i++) {

			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		// Use array class toString method to print the arrays
		System.out.println(Arrays.toString(c));

	}

}
