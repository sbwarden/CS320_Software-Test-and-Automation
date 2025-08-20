/*
 * CS 320 - Module 3 Milestone
 * 
 * Created by: Sarah Warden
 * Date: July 19, 2025 
 * 
 */

package Contact;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String contactAddress;
	
	// constructor
	public Contact (String conID, String fName, String lName, String number, String conAddress) {
		
		// check ID 1-10 characters and not null
		if (conID == null || conID.length() >= 11) {
			throw new IllegalArgumentException("Invalid ID.");
		} // end if
		
		// check firstName between 1 - 10 characters and not null
		if (fName == null || fName.length() >= 11) {
			throw new IllegalArgumentException("Invalid first name.");
		} // end if
		
		// check lastName between 1 - 10 characters and not null
		if (lName == null || lName.length() >= 11) {
			throw new IllegalArgumentException("Invalid last name.");
		} // end if
		
		// check number exactly 10 digits and not null
		if (number.length() != 10 || number == null) {
			throw new IllegalArgumentException("Invalid phone number.");
		} // end if
		
		// check conAddress less or equal to 30 characters and not null
		if (conAddress == null || conAddress.length() >= 31) {
			throw new IllegalArgumentException("Invalid contact address.");
		} // end if
		
		
		this.contactID = conID;
		this.firstName = fName;
		this.lastName = lName;
		this.phoneNumber = number;
		this.contactAddress = conAddress;
	} // end Contact constructor
	
	// getters
	public int getContactID() {
		return Integer.valueOf(contactID);
	} // end getContactID
	
	public String getFirstName() {
		return this.firstName;
	} // end getFirstName
	
	public String getLastName() {
		return this.lastName;
	} // end getLastName
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	} // end getPhoneNumber
	
	public String getContactAddress() {
		return this.contactAddress;
	} // end getContactAddress
	
	// setters
	public void setContactID (String newContactID) {
		if (newContactID == null || newContactID.length() >= 11) {
			throw new IllegalArgumentException("Invalid ID.");
		} // end if
		else {
			contactID = newContactID;
		} // end else
	} // end setContactID
	
	public void setFirstName (String newFirstName) {
		if (newFirstName == null || newFirstName.length() >= 11) {
			throw new IllegalArgumentException("Invalid first name.");
		} // end if
		else {
			firstName = newFirstName;
		} // end else
	} // end setFirstName
	
	public void setLastName (String newLastName) {
		if (newLastName == null || newLastName.length() >= 11) {
			throw new IllegalArgumentException("Ivalid last name.");
		} // end if
		else {
			lastName = newLastName;
		} // end else
	} // end setLastName
	
	public void setPhoneNumber (String newNumber) {
		if (newNumber == null || newNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number.");
		} // end if
		else {
			phoneNumber = newNumber;
		} // end else
	} // end setPhoneNumber
	
	public void setContactAddress (String newAddress) {
		if (newAddress == null || newAddress.length() >= 31) {
			throw new IllegalArgumentException("Invalid address.");
		} // end if
		else {
			contactAddress = newAddress;
		} // end else
	} // end setContactAddress
	
	public static void main (String[] args) {
		
	}

} // end Contact Class
