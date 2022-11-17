package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bill")

public class Bill {
	@Id
	private long transactionId;
	private int planId;
	

	private long phoneNumber;
	
	private static long idGen = 100000L;
	
	public Bill() {
		super();
		 this.transactionId = ++idGen;
	}

	public Bill( int planId, long phoneNumber) {
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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	

}
