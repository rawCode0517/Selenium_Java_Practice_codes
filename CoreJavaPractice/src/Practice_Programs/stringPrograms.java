package Practice_Programs;

public class stringPrograms {

	public static void main(String[] args) {
		reverseAString();
	}

	public static void reverseAString() {
		String name = "ltimindtree";
		String rev = "";

		for (int i = 0; name.length() > i; i++) {
			rev = name.charAt(i) + rev;
		}
		System.out.println(rev);
	}
}
