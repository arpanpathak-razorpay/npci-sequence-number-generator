/***
 * Static Helper Methods for Date Conversions
 * 
 * @author Arpan Pathak
 */
package com.npci.sequencegenerator.helpers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	 * @param d1
	 * @param d2
	 * @return long difference in days
	 */
	public static long getDifferenceDays(Date d1, Date d2) {
		
		// Get the timestamp Difference between two dates
	    long diff = d2.getTime() - d1.getTime();
	    
	    // Return 
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	/***
	 * Get difference in weeks between two dates
	 * @param d1
	 * @param d2
	 * @return long difference in days
	 */
	public static long getDifferenceWeeks(Date d1, Date d2) {
		
		// Get the timestamp Difference between two dates
	    long diff = d2.getTime() - d1.getTime();
	    
	    // Return 
	    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
//	public static void main(String[] args) {
//
//		System.out.println(getDifferenceDays(parseDate("10-11-2020"),parseDate("10-11-2020")) );
//	}
}
