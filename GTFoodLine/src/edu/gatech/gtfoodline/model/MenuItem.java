package edu.gatech.gtfoodline.model;

/**
 * @author sahilgupta
 *
 * This class represent a Menu Item Object. This stores basic
 * information about an item such its price, description, etc.
 * 
 */

public class MenuItem {

	private String itemName;
	private String description;
	private Double price;
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
