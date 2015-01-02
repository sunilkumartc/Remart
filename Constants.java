package com.redmart.constants;


public class Constants {

	public static final Integer Height_MAX = 15; 
	public static final Integer width_MAX=120;
	public static final Integer breath_MAX=75;
	public static final Integer slot_NOTAVAILABLE=5;
	public static final Integer van_count=4;
	public static final String order_Insert = "INSERT INTO order_details "+"(cus_id, order_date) VALUES (?, ?)";
	public static final String order_select = "SELECT max(order_id) FROM order_details";
	public static final String order_items_Insert = "INSERT INTO order_items "+"(order_id, height,breath,width,itemname) VALUES (?, ? , ? ,?,?)";
	public static final String book_details_Insert = "INSERT INTO book_details "+"(order_id, slot_id,book_date,ship_date) VALUES (?, ? , ? ,?)";
	public static final String book_select = "SELECT max(book_id) FROM book_details";
	public static String slot_count="SELECT count FROM slot_details where slotid=? and date = ?";
	public static String slot_insert="INSERT INTO slot_details"+"(slotid,date) values (?,?)";

	
}
