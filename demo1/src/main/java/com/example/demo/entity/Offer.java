package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.*;

@Entity
@Table(name = "Plan")
public class Offer {
       @Id
		private int planId;
		private String days;
		private String talkTime;
		private String data;
		private String price;
		
		@ManyToOne
		private Operator operator;
		
		
		


		public Offer() {
			super();
		}



		public Offer(int planId, String days, String talkTime, String data, String price) {
			super();
			this.planId = planId;
			this.days = days;
			this.talkTime = talkTime;
			this.data = data;
			this.price = price;
		}
		
		
		
		public int getPlanId() {
			return planId;
		}

		public void setPlanId(int planId) {
			this.planId = planId;
		}

		public String getDays() {
			return days;
		}

		public void setDays(String days) {
			this.days = days;
		}

		public String getTalkTime() {
			return talkTime;
		}

		public void setTalkTime(String talkTime) {
			this.talkTime = talkTime;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		
		@Override
		public String toString() {
			return "Offer [planId=" + planId + ", days=" + days + ", talkTime=" + talkTime + ", data=" + data
					+ ", price=" + price + ", operator=" + operator + "]";
		}

		
		

	}



