/***
 * Service class for Frequency Generator
 * 
 * @author Arpan Pathak
 */
package com.npci.sequencegenerator.service;

import com.npci.sequencegenerator.helpers.DateHelpers;
import com.npci.sequencegenerator.model.PaymentEntity;

public class FrequencyGenerator {
	
	/***
	 * Method to generate frequency for next payment
	 * 
	 * @param payment PaymentEntity 
	 * @return
	 */
	public long generateFrequency(PaymentEntity payment) {
		
		// No no currentDate provided in payment then take Current Unix Timestamp
		
		switch (payment.getFrequency()) {
			case DAILY:
				return 1 + DateHelpers.getDifferenceDays(
							payment.getCurrentDate(), 
							payment.getFirstPaymentDate()
							
						);
			case WEEKLY:
				return 1 + DateHelpers.getDifferenceWeeks(
						payment.getCurrentDate(), 
						payment.getFirstPaymentDate()
					);
				
			case FORTNIGHTLY:
				return 0;
			case MONTHLY:
				return 0;
			default:
				return -1;
		}
		
	}
	
}
