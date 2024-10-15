package Practice_Programs;

public class stringsInJave {

	// A string is an object in java which represents sequence of characters

	public void stringCheck() {
		// Two ways of defining string are by String literal and by using new keyword//

		String s = "Neha is a good girl";// This is known as String literal
		String s1 = "Neha is a good girl";// This is another object of string called s1 but it will
											// point to s as the value for both the string is same " Neha is a good
											// girl" that is why it will
											// not create new memory because of same value

		// Defining string with new keyword
		String s2 = new String("Practicing java is fun even though you have forgotten the concepts");
		String s3 = new String("Practicing java is fun even though you have forgotten the concepts");
		// Here string object s2 and s3 will create unique memory space even though the
		// value of both the string is same
		// because we have used "new" keyword that is why it will create separate space
		// in the memory for both the string

	}

	public static void splitAString() {

		String s = "Neha is a good girl";
		// In order to split a string we have split function in java
		s.split(" ");// splitting the string with space
		String[] splittedString = s.split(" ");
		System.out.println(splittedString.length);
		int i;
		for (i = 0; splittedString.length > i; i++) {
			System.out.println(splittedString[i]);
		}

	}

	public static void splitString() {
		String bu = new String("he is the best actor");
		String[] splitval = bu.split("best");

		for (int i = 0; i < splitval.length; i++) {
			System.out.println(splitval[i].trim());
		}

	}

	public static void splitStringToChar() {

		String xa = new String("Yellow baloon is university");

		String[] b = xa.split("is");

		for (int i = 0; i < b.length; i++) {

			System.out.println(b[i].trim());
			String obj = b[i].trim();
			String rev = "";

			if (obj.equalsIgnoreCase("university")) {
				System.out.println("pass");
				for (int j = 0; obj.length() > j; j++) {
					System.out.println(obj.charAt(j));
					rev = obj.charAt(j) + rev;

				}

				System.out.println(rev);

			}

		}

	}

	public static String stringInsertion() {
		String strOrig = "GeeksGeeks";
		String strToBeInserted = "for";
		int index = 5;
		String newString = new String();

		for (int i = 0; i < strOrig.length(); i++) {

			newString = strOrig.charAt(i) + newString;
			System.out.println(strOrig.charAt(i));
			if (i == index) {
				newString += strToBeInserted;
			}

		}

		return newString;
	}

	public static void main(String[] args) {

		System.out.println(stringInsertion());
		splitAString();
		splitString();
		splitStringToChar();
	}

}
