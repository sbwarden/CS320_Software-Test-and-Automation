/*
 * CS 320 - Module 3 Milestone
 * 
 * Created by: Sarah Warden
 * Date: July 19, 2025 
 * 
 */

package Contact;

import java.util.List;
import java.util.ArrayList;

public class ContactService {
	
	// contact counter
	int contactIdNumber = 1;
	
	// create contact list
	public static List<Contact> contactList = new ArrayList<Contact>();
	
	// add contacts with unique ID
	public void addContact (String fName, String lName, String number, String conAddress) {
		
		String contactID = Integer.toString(contactIdNumber);
		Contact newContact = new Contact(contactID, fName, lName, number, conAddress);
		contactList.add(newContact);
		
		contactIdNumber++;
	} // end addContact
	
	// delete contact of specific ID
	public void deleteContact(String contactId) {
		int contactIdNum = Integer.valueOf(contactId);
		
		for (int i = 0 ; i < ContactService.contactList.size() ; i++) {
			if (ContactService.contactList.get(i).getContactID() == contactIdNum) {
				contactList.remove(i);
			} // end if
		} // end for
	} // end deleteContact
	
	// update contact fields of specific ID
		// firstName
	public void updateFirstName(String contactId, String newFirstName) {
		int contactIdNum = Integer.valueOf(contactId);
		
		for (int i = 1 ; i < ContactService.contactList.size()+1 ; i++) {
			if (ContactService.contactList.get(i).getContactID() == contactIdNum) {
				ContactService.contactList.get(contactIdNum).setFirstName(newFirstName);
			} // end if
		} // end for
	} // end updateFirstName
	
		// lastName
	public void updateLastName (String contactId, String newLastName) {
		int contactIdNum = Integer.valueOf(contactId);
		
		for (int i = 0 ; i < ContactService.contactList.size() ; i++) {
			if (ContactService.contactList.get(i).getContactID() == contactIdNum) {
				ContactService.contactList.get(contactIdNum).setLastName(newLastName);
			} // end if
		} // end for
	} // end updateLastName
	
		// phoneNumber
	public void updatePhoneNumber (String contactId, String newPhoneNumber) {
		int contactIdNum = Integer.valueOf(contactId);
		
		for (int i = 0 ; i < ContactService.contactList.size() ; i++) {
			if (ContactService.contactList.get(i).getContactID() == contactIdNum) {
				ContactService.contactList.get(contactIdNum).setPhoneNumber(newPhoneNumber);
			} // end if
		} // end for
	} // end updatePhoneNumber
	
		// contactAddress
	public void updateContactAddress (String contactId, String newAddress) {
		int contactIdNum = Integer.valueOf(contactId);
		
		for (int i = 0 ; i < ContactService.contactList.size() ; i++) {
			if (ContactService.contactList.get(i).getContactID() == contactIdNum) {
				ContactService.contactList.get(contactIdNum).setContactAddress(newAddress);
			} // end if
		} // end for
	} // end updateContactAddress

} // end ContactService class
