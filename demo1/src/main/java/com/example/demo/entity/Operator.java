package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.demo.entity.Offer;

@Entity
@Table(name="operator")
public class Operator {
	@Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name=" operatorId",unique=true,nullable=false)
    private int operatorId;
    @Column(name="operatorName",unique=true)
	
    private String operatorName;
    @OneToMany(mappedBy = "operator")
    private List<Offer> offer;
	
    public Operator() {
		super();
	}

	public Operator(int operatorId, String operatorName) {
		super();
		this.operatorId = operatorId;
		this.operatorName = operatorName;
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

}

