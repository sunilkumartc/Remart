package com.redmart.apputils;

import com.redmart.constants.Constants;
import com.redmart.vo.BookResponseVo;
import com.redmart.vo.DimensionVo;
import com.redmart.vo.OrderDetailsVo;

public class ValidateOrders {

	
	public BookResponseVo validateAllocation(OrderDetailsVo orderDetailsVo){
		
		String str=null;
		
		Boolean isfalied =false;
		
		
		if(Constants.slot_NOTAVAILABLE==orderDetailsVo.getTimeslot()){
			
			str = "This Time Slot Not Available to Book-1PM-2PM";
			
			isfalied =true;
		}
		else{
			
		for(DimensionVo dimensionVo :orderDetailsVo.getOrders()){
			//validate for height
			if(!(dimensionVo.getHeight()<=Constants.Height_MAX )){
			 
			  str ="Cannot Fit the Height Should be less than or equal 15 inches";
			  
			  isfalied =true;
			  
			}
			else if(!(dimensionVo.getBreath()<=Constants.breath_MAX)){
				 
				str ="Cannot Fit the Breath Should be less than or equal"+Constants.breath_MAX ;
				  isfalied =true;

			}
			else if(!(dimensionVo.getWidth()<=Constants.width_MAX)){
				 
				str ="Cannot Fit the Width Should be less than or equal "+Constants.width_MAX ;
				
				isfalied =true;

			}
				
		}
		
		}
		BookResponseVo bookResponseVo =new BookResponseVo();
		
		bookResponseVo.setStatus(str);
		
		bookResponseVo.setIsfailed(isfalied);
		
		return bookResponseVo ;
	}
		
		
}
