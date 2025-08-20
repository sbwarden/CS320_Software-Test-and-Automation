/*
 * CS 320 - Module 3 Milestone
 * 
 * Created by: Sarah Warden
 * Date: July 20, 2025 
 * 
 * UPDATED: July 27, 2025
 * 		Added a test for duplicate contactID
 * 
 */

package testClasses;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Contact.Contact;

import org.junit.jupiter.api.DisplayName;

class ContactTest {
	
	// testing valid arguments
	@DisplayName("Valid Constructor Test")
	@Test
	void testContact() {
		String testID = "1";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		Contact testContact = new Contact(testID, testFirstName, testLastName, testNumber, testAddress);
		
		assertTrue(testContact.getContactID().equals("1"));
		assertTrue(testContact.getFirstName().equals("Sarah"));
		assertTrue(testContact.getLastName().equals("Warden"));
		assertTrue(testContact.getPhoneNumber().equals("1234567890"));
		assertTrue(testContact.getContactAddress().equals("123 Unicorn Lane, Candy Land"));
	} // end valid testContact
	
	@DisplayName("Valid setFirstName Test")
	@Test
	void testValidSetFirstName() {
		String testID = "2";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		Contact testContact = new Contact(testID, testFirstName, testLastName, testNumber, testAddress);
		testContact.setFirstName("Testing");
		
		assertTrue(testContact.getFirstName().equals("Testing"));
	} // end valid first name test
	
	@DisplayName("Valid setLastName Test")
	@Test
	void testValidSetLastName() {
		String testID = "3";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		Contact testContact = new Contact(testID, testFirstName, testLastName, testNumber, testAddress);
		testContact.setLastName("Testing");
		
		assertTrue(testContact.getLastName().equals("Testing"));
	} // end valid last name test
	
	@DisplayName("Valid setNumber Test")
	@Test
	void testValidSetNumber() {
		String testID = "4";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		Contact testContact = new Contact(testID, testFirstName, testLastName, testNumber, testAddress);
		testContact.setPhoneNumber("0987654321");
		
		assertTrue(testContact.getPhoneNumber().equals("0987654321"));
	} // end valid number test
	
	@DisplayName("Valid setContactAddress Test")
	@Test
	void testValidSetContactAddress() {
		String testID = "5";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		Contact testContact = new Contact(testID, testFirstName, testLastName, testNumber, testAddress);
		testContact.setContactAddress("Testing");
		
		assertTrue(testContact.getContactAddress().equals("Testing"));
	} // end valid address test
	
	// testing invalid arguments
	@DisplayName("Null Arguments Test")
	@Test
	void testNullArguments() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, null, null, null, null);
		});
	} // end test null arguments

	@DisplayName("Invalid setFirstName Length Test")
	@Test
	void testInvalidSetFirstName() {
		String testID = "6";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		Contact testContact = new Contact(testID, testFirstName, testLastName, testNumber, testAddress);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setFirstName("ARidiculouslyLongName");
		});
	} // end invalid first name test
	
	@DisplayName("Invalid setLastName Length Test")
	@Test
	void testInvalidSetLastName() {
		String testID = "7";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		Contact testContact = new Contact(testID, testFirstName, testLastName, testNumber, testAddress);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setLastName("ARidiculouslyLongName");
		});
	} // end invalid last name test
	
	@DisplayName("Invalid setNumber Test: Too Short")
	@Test
	void testInvalidSetNumberShort() {
		String testID = "7";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		Contact testContact = new Contact(testID, testFirstName, testLastName, testNumber, testAddress);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhoneNumber("123");
		});
	} // end invalid number test too short
	
	@DisplayName("Invalid setNumber Test: Too Long")
	@Test
	void testInvalidSetNumberLong() {
		String testID = "8";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		Contact testContact = new Contact(testID, testFirstName, testLastName, testNumber, testAddress);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setPhoneNumber("12345678901234567890");
		});
	} // end invalid number test too long
	
	@DisplayName("Invalid setContactAddress Length Test")
	@Test
	void testInvalidSetContactAddress() {
		String testID = "9";
		String testFirstName = "Sarah";
		String testLastName = "Warden";
		String testNumber = "1234567890";
		String testAddress = "123 Unicorn Lane, Candy Land";
		
		Contact testContact = new Contact(testID, testFirstName, testLastName, testNumber, testAddress);

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			testContact.setContactAddress("12345678901234567890 That Was Already 20, So This Is Far Too Long");
		});
	} // end invalid address test
	

} // end ContactTest Class
