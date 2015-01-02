package com.redmart.webapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.redmart.orders.PlaceOrderWrapper;
import com.redmart.vo.BookResponseVo;
import com.redmart.vo.OrderDetailsVo;
@Controller
@RequestMapping( value = "/redmart" )
class AppController{
	private static Logger LOG = LoggerFactory
			.getLogger(AppController.class);
   

   
   @Autowired
   PlaceOrderWrapper placeOrderWrapper;
   
 @RequestMapping(value="/placeOrder", method = RequestMethod.POST,headers = "Accept=application/json")
   public ResponseEntity<BookResponseVo> placeOrder(@RequestBody OrderDetailsVo orderDetails){
	   
	  LOG.debug("--In Rest URL");
	   
	  BookResponseVo bookResponseVo = null;
	  
	  bookResponseVo= placeOrderWrapper.placeOrder(orderDetails);
	  	  
	  return new ResponseEntity<BookResponseVo>(bookResponseVo, HttpStatus.OK);
   }
}
 
