package edu.gatech.gtfoodline.model;

/**
 * @author sahilgupta
 *
 * This class represent a Restaurant Menu Object.
 * A menu is composed restaurant name, menu name such
 * as breakfast menu, dinner menu, etc and several items.
 */

public class RestaurantMenu {

	private String Restaurant;
	private String menuName;
	private MenuItem[] menu;

	public String getRestaurant() {
		return Restaurant;
	}
	public void setRestaurant(String restaurant) {
		Restaurant = restaurant;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public MenuItem[] getMenu() {
		return menu;
	}
	public void setMenu(MenuItem[] menu) {
		this.menu = menu;
	}
	
}
