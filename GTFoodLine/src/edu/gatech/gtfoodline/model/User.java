package edu.gatech.gtfoodline.model;

public class User {
	
	private static String username;
	private static String passwordEncryption;
	private static String firstName;
	private static String lastName;
	private static Double phoneNumber;
	private static String emailAddress;
	private static Boolean isVendor;
	private static String organization;

	public static String getUsername() {
		return username;
	}
	public static void setUsername(String username) {
		User.username = username;
	}
	public static String getPassword() {
		return passwordEncryption;
	}
	public static void setPassword(String password) {
		User.passwordEncryption = password;
	}
	public static String getFirstName() {
		return firstName;
	}
	public static void setFirstName(String firstName) {
		User.firstName = firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	public static void setLastName(String lastName) {
		User.lastName = lastName;
	}
	public static Double getPhoneNumber() {
		return phoneNumber;
	}
	public static void setPhoneNumber(Double phoneNumber) {
		User.phoneNumber = phoneNumber;
	}
	public static String getEmailAddress() {
		return emailAddress;
	}
	public static void setEmailAddress(String emailAddress) {
		User.emailAddress = emailAddress;
	}
	public static Boolean getIsVendor() {
		return isVendor;
	}
	public static void setIsVendor(Boolean isVendor) {
		User.isVendor = isVendor;
	}
	public static String getOrganization() {
		return organization;
	}
	public static void setOrganization(String organization) {
		User.organization = organization;
	}
	
}
