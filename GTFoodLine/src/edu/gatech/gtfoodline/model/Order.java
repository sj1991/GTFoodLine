package edu.gatech.gtfoodline.model;

import java.math.BigDecimal;

/**
 * @author sahilgupta
 * 
 * This class represents an order. It consists of items
 * the customer/client bought, info associated with order,
 * user info etc.
 * 
 */
public class Order {

	private String orderID;//unique ID representing each and every order
	private User user;
	private BigDecimal dateTimePlaced;//time in millis representing when the order was placed
	private String paymentInfo;//string representation of how the user paid for the order
	private Restaurant restaurant;
	private MenuItem[] itemsOrdered;
	private String comments;
	
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public BigDecimal getDateTimePlaced() {
		return dateTimePlaced;
	}
	public void setDateTimePlaced(BigDecimal dateTimePlaced) {
		this.dateTimePlaced = dateTimePlaced;
	}
	public String getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public MenuItem[] getItemsOrdered() {
		return itemsOrdered;
	}
	public void setItemsOrdered(MenuItem[] itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}

}
