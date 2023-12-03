package com.surabhichainrestaurant.foodorder.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer OrderId;
//	private Integer foodId;
	private String image;
	private String name;
	private Integer price;
	private Integer quantity;
	private String tag;
//	private Integer userId;
	private String userName;
	public Integer getOrderId() {
		return OrderId;
	}
	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public String getUsename() {
		return userName;
	}
	public void setUsename(String usename) {
		this.userName = usename;
	}
	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", image=" + image + ", name=" + name + ", price="
				+ price + ", quantity=" + quantity + ", tag=" + tag +  ", userName=" + userName
				+ "]";
	}
	public Orders(Integer orderId, String image, String name, Integer price, Integer quantity,
			String tag, String usename) {
		super();
		OrderId = orderId;
//		this.foodId = foodId;
		this.image = image;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.tag = tag;
//		this.userId = userId;
		this.userName = usename;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	

}
