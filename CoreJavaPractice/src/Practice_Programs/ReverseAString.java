package Practice_Programs;

public class ReverseAString {

	public static void main(String[] args) {

		String name = "ansuman";
		String reversedStr = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reversedStr = reversedStr + name.charAt(i);
		}
		System.out.println(reversedStr);
		reverseStringBuilder();
	}

	public static void reverseStringBuilder() {

		String fn = "aroma";

		String reversestring;

		reversestring = new StringBuilder(fn).reverse().toString();
		System.out.println(reversestring);
	}

}
