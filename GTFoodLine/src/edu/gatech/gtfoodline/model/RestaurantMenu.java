package edu.gatech.gtfoodline.model;

public class RestaurantMenu {

	private String Restaurant;
	private MenuItem[] menu;

	public String getRestaurant() {
		return Restaurant;
	}
	public void setRestaurant(String restaurant) {
		Restaurant = restaurant;
	}
	public MenuItem[] getMenu() {
		return menu;
	}
	public void setMenu(MenuItem[] menu) {
		this.menu = menu;
	}
	
}
