/***
 * Service class for Frequency Generator
 * 
 * @author Arpan Pathak
 */
package com.npci.sequencegenerator.service;

import java.util.Date;

import com.npci.sequencegenerator.model.PaymentEntity;

public class FrequencyGenerator {
	
	/***
	 * Method to generate frequency for next payment
	 * 
	 * @param payment PaymentEntity 
	 * @return
	 */
	public int generateFrequency(PaymentEntity payment) {
		
		// No no currentDate provided in payment then take Current Unix Timestamp
		int frequency = -1;
		
		switch (payment.getFrequency()) {
			
		}
		return -1;
	}
}
