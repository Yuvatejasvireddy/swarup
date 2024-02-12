package com.blueyonder.team4.model;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Order_Table {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer o_id;
    private Integer[] p_ids;
    private Integer[] p_quantities;
    @Temporal(TemporalType.DATE)
	 private Date o_date ;
    @Temporal(TemporalType.DATE)
    private Date o_delivery;
    private String status;
    @ManyToOne
	 @JoinColumn(name="staff_id",referencedColumnName="staff_id",nullable=false)
	 private Staff Staff;
	public Integer getO_id() {
		return o_id;
	}
	public void setO_id(Integer o_id) {
		this.o_id = o_id;
	}
	public Integer[] getP_ids() {
		return p_ids;
	}
	public void setP_ids(Integer[] p_ids) {
		this.p_ids = p_ids;
	}
	public Integer[] getP_quantities() {
		return p_quantities;
	}
	public void setP_quantities(Integer[] p_quantities) {
		this.p_quantities = p_quantities;
	}
	public Date getO_date() {
		return o_date;
	}
	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}
	public Date getO_delivery() {
		return o_delivery;
	}
	public void setO_delivery(Date o_delivery) {
		this.o_delivery = o_delivery;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Staff getStaff() {
		return Staff;
	}
	public void setStaff(Staff staff) {
		Staff = staff;
	}
	@Override
	public String toString() {
		return "Order_Table [o_id=" + o_id + ", p_ids=" + Arrays.toString(p_ids) + ", p_quantities="
				+ Arrays.toString(p_quantities) + ", o_date=" + o_date + ", o_delivery=" + o_delivery + ", status="
				+ status + ", Staff=" + Staff + "]";
	}
    
    
}
