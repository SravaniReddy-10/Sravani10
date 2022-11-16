package com.MobileRecharge.entity;

import javax.persistence.*;


@Entity
@Table(name = "Plan")

public class Offer {
	
	private int planId;
	private String days;
	private String talkTime;
	private String data;
	private String price;
	

}
