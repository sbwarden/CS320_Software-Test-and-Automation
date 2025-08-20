/*
 * CS 320 - Module 3 Milestone
 * 
 * Created by: Sarah Warden
 * Date: July 20, 2025 
 * 
 */

package testClasses;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Contact.ContactService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;

class ContactServiceTest {
	
	@AfterEach
    void tearDown() throws Exception {
        // clear the array after each test
        ContactService.contactList.clear();
    } 
	
	@DisplayName("addContact Test")
	@Test
	void testAddContact() {
		String testContactId = "1";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		ContactService testCS = new ContactService();
		assertTrue(ContactService.contactList.isEmpty());
		
		testCS.addContact(testContactId, testFirstName, testLastName, testNumber, testAddress);
		assertFalse(ContactService.contactList.isEmpty());
		assertEquals(testContactId, ContactService.contactList.get(0).getContactID());
		assertEquals(testFirstName, ContactService.contactList.get(0).getFirstName());
		assertEquals(testLastName, ContactService.contactList.get(0).getLastName());
		assertEquals(testNumber, ContactService.contactList.get(0).getPhoneNumber());
		assertEquals(testAddress, ContactService.contactList.get(0).getContactAddress());
		
	} // end addContact test
	
	@DisplayName("deleteContact Test")
	@Test
	void testDeleteContact () {
		String testContactId = "1";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		ContactService testCS = new ContactService();
		testCS.addContact(testContactId, testFirstName, testLastName, testNumber, testAddress);
		
		assertEquals(1, ContactService.contactList.size());
		testCS.deleteContact("1");
		assertEquals(0, ContactService.contactList.size());
	} // end deleteContact test
	
	@DisplayName("updateFirstName Test")
	@Test
	void testUpdateFirstName() {
		String testContactId = "1";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		ContactService testCS = new ContactService();
		testCS.addContact(testContactId, testFirstName, testLastName, testNumber, testAddress);
		
		assertEquals(testFirstName, ContactService.contactList.get(0).getFirstName());
		testCS.updateFirstName(testContactId, "Test");
		assertEquals("Test", ContactService.contactList.get(0).getFirstName());
		
	} // end updateFirstName test
	
	@DisplayName("updateLastName Test")
	@Test
	void testUpdateLastName() {
		String testContactId = "1";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		ContactService testCS = new ContactService();
		testCS.addContact(testContactId, testFirstName, testLastName, testNumber, testAddress);
		
		assertEquals(testLastName, ContactService.contactList.get(0).getLastName());
		testCS.updateLastName(testContactId, "Test");
		assertEquals("Test", ContactService.contactList.get(0).getLastName());
		
	} // end updateLastName test
	
	@DisplayName("updatePhoneNumber Test")
	@Test
	void testUpdatePhoneNumber() {
		String testContactId = "1";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		ContactService testCS = new ContactService();
		testCS.addContact(testContactId, testFirstName, testLastName, testNumber, testAddress);
		
		assertEquals(testNumber, ContactService.contactList.get(0).getPhoneNumber());
		String newPhoneNumber = "Test Ten #";
		testCS.updatePhoneNumber(testContactId, newPhoneNumber);
		assertEquals(newPhoneNumber, ContactService.contactList.get(0).getPhoneNumber());
	} // end updatePhoneNumber test
	
	@DisplayName("updateContactAddress Test")
	@Test
	void testUpdateContactAddress() {
		String testContactId = "1";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		ContactService testCS = new ContactService();
		testCS.addContact(testContactId, testFirstName, testLastName, testNumber, testAddress);
		
		assertEquals(testAddress, ContactService.contactList.get(0).getContactAddress());
		testCS.updateContactAddress(testContactId, "Test");
		assertEquals("Test", ContactService.contactList.get(0).getContactAddress());
	} // end updateContactAddress test

	
}
