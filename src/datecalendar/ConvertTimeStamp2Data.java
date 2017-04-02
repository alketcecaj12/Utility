package datecalendar;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertTimeStamp2Data {

	public static void main (String [] args) throws Exception{
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.println("data "+dateFormat.parse("1331499923916"));
		
	
		
	}
	
}
