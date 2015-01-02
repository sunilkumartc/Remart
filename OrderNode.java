package com.redmart.apputils;

public class OrderNode {

	/**
	 * 
	 */
	private OrderNode left;
	
	private OrderNode right;
	
	private Integer breadth;
	
	private Integer width;
	
	private Integer height;
	
	private Boolean isallocated;
	
	public OrderNode(Integer ht,Integer br ,Integer wd){
		this.breadth=br;
		this.width =wd;
		this.setHeight(ht);
	}
	public Integer getBreadth() {
		return breadth;
	}
	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public OrderNode getLeft() {
		return left;
	}
	public void setLeft(OrderNode left) {
		this.left = left;
	}
	public OrderNode getRight() {
		return right;
	}
	public void setRight(OrderNode right) {
		this.right = right;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Boolean getIsallocated() {
		return isallocated;
	}
	public void setIsallocated(Boolean isallocated) {
		this.isallocated = isallocated;
	}
}
