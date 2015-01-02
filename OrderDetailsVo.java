package com.redmart.vo;

import java.io.Serializable;
import java.util.ArrayList;

public class OrderDetailsVo implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9171583150539469537L;
	
	private String bookingdate;
	
	private Integer custID;
	
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public Integer getTimeslot() {
		return timeslot;
	}
	public void setTimeslot(Integer timeslot) {
		this.timeslot = timeslot;
	}
	public ArrayList<DimensionVo> getOrders() {
		return orders;
	}
	public void setOrders(ArrayList<DimensionVo> orders) {
		this.orders = orders;
	}
	public Integer getCustID() {
		return custID;
	}
	public void setCustID(Integer custID) {
		this.custID = custID;
	}
	private Integer timeslot;
	private ArrayList<DimensionVo> orders;
	
}
