/***
 * Static Helper Methods for Date Conversions
 * 
 * @author Arpan Pathak
 */
package com.npci.sequencegenerator.helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DateHelpers {

	/***
	 * Convert String to Date
	 * 
	 * @param date String
	 * @return util.Date Object
	 */
	public static Date parseDate(String date) {
		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		
		// Try parsing Date for dd-mm-yyyy format
		try {
			return formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/***
	 * Get difference in days between two dates
	 * @param first
	 * @param last
	 * @return long difference in days
	 */
	public static long getDifferenceDays(Date first, Date last) {
		
		// Get the timestamp Difference between two dates
	    long diff = first.getTime() - last.getTime();
	    
	    // Return UNIX time stamp difference / total MILLISECONDS in a day
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	/***
	 * Get difference in weeks between two dates
	 * @param d1
	 * @param d2
	 * @return long difference in days
	 */
	public static long getDifferenceWeeks(Date first, Date last) {
		
		// Get the timestamp Difference between two dates
	    long diff = first.getTime() - last.getTime();
	    
	    // Return timestamp difference / 7
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)/7;
	}
	
	public static long getDifferenceYears(Date first, Date last) {
		
		// Get Calendar for first and last date
		Calendar a = getCalendar(first);
	    Calendar b = getCalendar(last);
	    
	    int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
	    
	    // If Month of a is greater than b or 
	    // both are in same month but Day of a is greater than b then we need to subtract
	    // 1 from result since we are calculating difference between years first
	    if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) || 
	        (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) 
	        && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
	        diff--;
	    }
	    return diff;
	}
	
	public static Calendar getCalendar(Date date) {
	    Calendar cal = Calendar.getInstance(Locale.US);
	    cal.setTime(date);
	    return cal;
	}
	
	public static void main(String[] args) {
		
	}
	
}
