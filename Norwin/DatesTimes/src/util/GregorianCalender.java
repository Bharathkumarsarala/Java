package util;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
public class GregorianCalender {
	public static void main(String args[]) {
//	GregorianCalendar cal = new GregorianCalendar();
//    System.out.println(cal.isLeapYear(2000));
//    System.out.println(cal.isLeapYear(2021));
	
//	GregorianCalendar c = new GregorianCalendar();
//    	System.out.println("Date before rolling : " + c.getTime());
//
//    	c.roll(Calendar.MONTH, true);
//    	c.roll(Calendar.DATE, false);
//    	c.roll(Calendar.YEAR, true);
//    	System.out.println("Date after rolling : " + c.getTime());
		
		
		Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    
		
		
    
    
    
    
    
    
	}
}
