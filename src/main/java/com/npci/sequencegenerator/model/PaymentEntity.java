/***
 * Model Entity class for Payments
 * 
 * @author Arpan Pathak
 */
package com.npci.sequencegenerator.model;

import java.util.Date;

import com.npci.sequencegenerator.constants.Frequencies;
import com.npci.sequencegenerator.helpers.DateHelpers;

public class PaymentEntity {
	
	private Date firstPaymentDate, currentDate;
	private Frequencies frequency;
	
	// Factory Method with firstPaymentDate and frequency
	public static PaymentEntity getInstance(String firstPaymentDate, Frequencies frequency) {
		return new PaymentEntity()
				.setFirstPaymentDate(DateHelpers.parseDate(firstPaymentDate))
				.setFrequency(frequency);	
					
	}
	
	// Factory Method with firstPaymentDate and frequency
	public static PaymentEntity getInstance(String firstPaymentDate, String currentDate, Frequencies frequency) {
		return new PaymentEntity()
				.setFirstPaymentDate(DateHelpers.parseDate(firstPaymentDate))
				.setCurrentDate(DateHelpers.parseDate(currentDate))
				.setFrequency(frequency);	
	}

	public Date getFirstPaymentDate() {
		return firstPaymentDate;
	}

	public PaymentEntity setFirstPaymentDate(Date firstPaymentDate) {
		this.firstPaymentDate = firstPaymentDate;
		
		return this;
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public PaymentEntity setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
		
		return this;
	}

	public Frequencies getFrequency() {
		return frequency;
	}

	public PaymentEntity setFrequency(Frequencies frequency) {
		this.frequency = frequency;
		
		return this;
	}
	
}
