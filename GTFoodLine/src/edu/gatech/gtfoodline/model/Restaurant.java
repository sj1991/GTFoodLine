package edu.gatech.gtfoodline.model;

/**
 * @author sahilgupta
 *
 * This class represent a Restaurant. A restaurant has several menus
 * associated with it. For instance, a restaurant with many menus 
 * such as Breakfast, Lunch, Dinner, etc will have several instances
 * of this object associated with it.
 */


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
