package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class Calender {
	public static void main(String args[]) {
		Calendar c= Calendar.getInstance();
//		System.out.println(c.getInstance());
//		System.out.println("calendar type:"+" "+c.getCalendarType());
//		System.out.println("time zone:"+c.getTimeZone());

//		Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/singapore"));
//		System.out.println("calendar type:"+" "+c.getCalendarType());
//		System.out.println("time zone:"+c.getTimeZone().getID());

		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		System.out.println("Current year is :" + c.get(Calendar.YEAR));

		// The indexing for month field ranges from [0,11]
		System.out.println("Current month is :" + c.get(Calendar.MONTH));
		System.out.println("Current day is :" + c.get(Calendar.DAY_OF_MONTH));
//        System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
//        System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
//        System.out.println("Current second is :"+ c.get(Calendar.SECOND));
//		System.out.println(LocalDateTime.now());
//        System.out.println(LocalDate.now());
		
		
		
		
	}

	

}
