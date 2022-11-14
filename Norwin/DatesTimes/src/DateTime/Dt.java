package DateTime;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
public class Dt {
	public static void main(String args[]) {
		
//		Date d1=new Date();
//		System.out.println(d1.getDate());
//		Date d2=new Date(2000,8,13);
//		System.out.println(d2.getDate());
//		System.out.println("date d1 is after date d2:"+ d1.after(d2));
//		System.out.println("date d1 is after date d2:"+ d1.before(d2));
//		System.out.println("your compared value is:"+d1.compareTo(d2));
//		System.out.println("your compared value is:"+d1.equals(d2));
//		
//		//it returns millisec from 1970 to present date;
//		System.out.println("comapared value"+d1.getTime());
//		System.out.println("month:"+d1.getMonth());
		
		
		java.util.Date Utildate = new Date();
        java.sql.Date sqlDate = new java.sql.Date(Utildate.getTime());
		System.out.println("util Date TO SQL Date --> " + sqlDate);
//
//		java.util.Calendar utilCalendar = Calendar.getInstance();
//		utilCalendar.setTime(Utildate);
//		System.out.println("Util Date TO Calendar  -->" + utilCalendar.getTime());
//
//		Utildate = utilCalendar.getTime();
//		System.out.println("Calendar Date To Util Date  --> " + Utildate);
//
//		sqlDate = new java.sql.Date(utilCalendar.getTimeInMillis());
//		System.out.println("Calendar Date to SqlDate --> " + sqlDate);
//
//		Utildate = new Date(sqlDate.getTime());
//		System.out.println("Sql Date to Util Date --> " + Utildate);
//
//		Calendar cal4 = Calendar.getInstance();
//		cal4.setTime(sqlDate);
//		System.out.println("SqlDate to Calnedar date --> " + cal4.getTime());
//
//		LocalDateTime datetime = LocalDateTime.now();
//
//		sqlDate = java.sql.Date.valueOf(datetime.toLocalDate());
//		System.out.println("LocalDateTime to SqlDate -->" + sqlDate);
		
	}

	
	}

