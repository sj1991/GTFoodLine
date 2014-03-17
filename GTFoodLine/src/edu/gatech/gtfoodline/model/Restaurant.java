package edu.gatech.gtfoodline.model;

public class Restaurant {

	private String restaurantName;
	private RestaurantMenu[] restaurantMenus;
	
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public RestaurantMenu[] getRestaurantMenus() {
		return restaurantMenus;
	}
	public void setRestaurantMenus(RestaurantMenu[] restaurantMenus) {
		this.restaurantMenus = restaurantMenus;
	}

}
