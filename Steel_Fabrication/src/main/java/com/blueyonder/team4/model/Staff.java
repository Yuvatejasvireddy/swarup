package com.blueyonder.team4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Staff {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private int staff_id;
     private String first_name;
     private String last_name;
     private String phone;
     private String mail;
     private String password;
     private int role;
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public int getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
}


//
//CREATE TABLE staff (
//    staff_id SERIAL PRIMARY KEY,
//    first_name VARCHAR(50) NOT NULL,
//    last_name VARCHAR(50) NOT NULL,
//    phone VARCHAR(20) NOT NULL,
//    mail VARCHAR(100) UNIQUE NOT NULL,
//    password VARCHAR(255) NOT NULL,
//    role INTEGER NOT NULL
//);