package com.redmart.vo;

import java.io.Serializable;

public class DimensionVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1716174877772826693L;
	
	private String itemName;
	
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getBreath() {
		return breath;
	}
	public void setBreath(Integer breath) {
		this.breath = breath;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	private Integer height;
	private Integer width;
	private Integer breath;
}
