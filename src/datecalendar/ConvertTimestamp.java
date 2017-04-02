package datecalendar;
import java.util.Date;
//import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class ConvertTimestamp {

	  private static final SimpleDateFormat monthDayYearformatter = new SimpleDateFormat(
	      "MMMMM dd, yyyy");

	  private static final SimpleDateFormat monthDayformatter = new SimpleDateFormat("MMMMM dd");

	  public static String timestampToMonthDayYear(Timestamp timestamp) {
	    if (timestamp == null) {
	      return null;
	    } else {
	      return monthDayYearformatter.format((java.util.Date) timestamp);
	    }
	  }

	  public static String timestampToMonthDay(Timestamp timestamp) {
	    if (timestamp == null) {
	      return null;
	    } else {
	      return monthDayformatter.format((java.util.Date) timestamp);
	    }
	  }

	  public static java.sql.Timestamp getTimestamp() {
	    java.util.Date today = new java.util.Date();
	    return new java.sql.Timestamp(today.getTime());
	  }
	  
	  public static void main (String [] args)throws Exception{
		  
		  
		  
		  DateFormat dateFormat = new SimpleDateFormat("ssmmdd/mm/yyyy");
		  Date date = dateFormat.parse("11222322/22/2007");
		  long time = date.getTime();
		  Timestamp ts = new Timestamp(time);
		  System.out.println(ts.getTime());
		  
		  Date dat1 = dateFormat.parse("12122112/22/2009");
		  long time1 = ts.getTime();
		  
	  }
	}