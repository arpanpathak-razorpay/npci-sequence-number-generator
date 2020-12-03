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

public class DateHelpers {

	/***
	 * Convert String to Date
	 * 
	 * @param date String
	 * @return util.Date Object
	 */
	public static Date parseDate(String date) {
		DateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
		
		// Try parsing Date for dd-mm-yyyy format
		try {
			return formatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
