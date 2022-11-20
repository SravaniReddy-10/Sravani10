package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Bill")



public class Bill {
	@Id
	@GeneratedValue(generator="trans_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name = "trans_seq",initialValue=10000,allocationSize=1)
	private long transactionId;
	private int planId;
	

	private long phoneNumber;
	
	
	
	public Bill() {
		super();
		 
	}

	public Bill( int planId, long phoneNumber) {
		super();
		
		this.planId = planId;
		this.phoneNumber = phoneNumber;
	}

	public long getTransactionId() {
		return transactionId;
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

	@Override
	public String toString() {
		return "Bill [transactionId=" + transactionId + ", planId=" + planId + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
