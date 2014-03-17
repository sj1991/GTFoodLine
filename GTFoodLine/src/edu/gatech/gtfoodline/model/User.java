package edu.gatech.gtfoodline.model;

/**
 * @author sahilgupta
 *
 * This class represent a User. A user can be either a vendor or a 
 * client/customer user. This object stores information about the 
 * user temporarily during its existence. The password's encryption 
 * will be stored only. AES 128 bit encryption will be used to encrypt
 * and decrypt the password.
 * 
 */

public class User {

	private static User INSTANCE = null;
	
	//This helps in creating a singleton User class to make 
	//sure only one instance exits and multiple threads do not
	//access it at the same time/locked properly.
	protected User(){}
	
	public static synchronized User getInstance(){
		if(INSTANCE == null){
			INSTANCE = new User();
		}
		return INSTANCE;
	}
	
	private String username;//has to be unique identifier for all users, Cannot be Null
	private String passwordEncryption;//Cannot be Null
	private String firstName;//Cannot be Null
	private String lastName;//Cannot be Null
	private Double phoneNumber;//May or may not be Null
	private String emailAddress;//Cannot be Null
	private String organization;//May or may not be Null

	public static User getINSTANCE() {
		return INSTANCE;
	}

	public static void setINSTANCE(User iNSTANCE) {
		INSTANCE = iNSTANCE;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswordEncryption() {
		return passwordEncryption;
	}

	public void setPasswordEncryption(String passwordEncryption) {
		this.passwordEncryption = passwordEncryption;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
}
