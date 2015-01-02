package com.redmart.vo;

public class BookResponseVo {

 private String bookingId;
 
 private String status;
 
 private Boolean isfailed;


 public String getStatus() {
	return status;
 }

 public void setStatus(String status) {
	this.status = status;

 }

public Boolean getIsfailed() {
	return isfailed;
}

public void setIsfailed(Boolean isfailed) {
	this.isfailed = isfailed;
}

public String getBookingId() {
	return bookingId;
}

public void setBookingId(String bookingId) {
	this.bookingId = bookingId;
}


 
 

}
