package com.blueyonder.team4.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private Integer c_id;
	 private String c_name;
	 private String c_area;
	 private String c_street;
	 private String c_city;
	 private int c_pin;
	 private String c_phone;
	 @Temporal(TemporalType.DATE)
	 private Date c_birth;
	 private String c_mail;
	 private double wallet_balance;
	 @ManyToOne
	 @JoinColumn(name="o_id",referencedColumnName="o_id",nullable=false)
	 private Order_Table order_table;
	public Integer getC_id() {
		return c_id;
	}
	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_area() {
		return c_area;
	}
	public void setC_area(String c_area) {
		this.c_area = c_area;
	}
	public String getC_street() {
		return c_street;
	}
	public void setC_street(String c_street) {
		this.c_street = c_street;
	}
	public String getC_city() {
		return c_city;
	}
	public void setC_city(String c_city) {
		this.c_city = c_city;
	}
	public int getC_pin() {
		return c_pin;
	}
	public void setC_pin(int c_pin) {
		this.c_pin = c_pin;
	}
	public String getC_phone() {
		return c_phone;
	}
	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}
	public Date getC_birth() {
		return c_birth;
	}
	public void setC_birth(Date c_birth) {
		this.c_birth = c_birth;
	}
	public String getC_mail() {
		return c_mail;
	}
	public void setC_mail(String c_mail) {
		this.c_mail = c_mail;
	}
	public double getWallet_balance() {
		return wallet_balance;
	}
	public void setWallet_balance(double wallet_balance) {
		this.wallet_balance = wallet_balance;
	}
	public Order_Table getOrder_table() {
		return order_table;
	}
	public void setOrder_table(Order_Table order_table) {
		this.order_table = order_table;
	}
	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", c_area=" + c_area + ", c_street=" + c_street
				+ ", c_city=" + c_city + ", c_pin=" + c_pin + ", c_phone=" + c_phone + ", c_birth=" + c_birth
				+ ", c_mail=" + c_mail + ", wallet_balance=" + wallet_balance + ", order_table=" + order_table + "]";
	}
	
	 
}