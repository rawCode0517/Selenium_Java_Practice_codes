package Practice_Programs;

public class maximumOccurenceInAString {

	public static void main(String[] args) {
		String word = "LTIMINDTREE";
		int s2;
		int total;
		int s1=word.length();
		 s2 =word.replace("E"
		 		+ "", "").length();

		 total = s1-s2;
		 System.out.println(total);
	
	
	}
	
}
