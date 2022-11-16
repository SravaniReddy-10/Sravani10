package com.MobileRecharge.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="operator")
public class Operator {
	
	private int operatorId;
	private String operatorName;

}
