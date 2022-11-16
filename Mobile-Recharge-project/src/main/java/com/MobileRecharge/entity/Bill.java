package com.MobileRecharge.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Bill")

public class Bill {
	
	private long transactionId;
	private int planId;
	

	private int phoneNumber;
	
	private static long idGen = 100000L;
	
	public Bill() {
		super();
		 this.transactionId = ++idGen;
	}

	public Bill( int planId, int phoneNumber) {
		super();
		this.transactionId = ++idGen;
		this.planId = planId;
		this.phoneNumber = phoneNumber;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	

}
