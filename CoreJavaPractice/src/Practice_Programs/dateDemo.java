package Practice_Programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	
	public static void main(String[] args) {
		//print current date/ current time
		
		Date dt = new Date();
		System.out.println(dt.toString());
		
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy  hh:mm:ss");
		
		System.out.println(sdf.format(dt));
		
		
	}
	
	
	
}
