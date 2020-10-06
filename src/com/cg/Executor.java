package com.cg;
import java.util.*;
//UC2
public class Executor {
	Scanner sc = new Scanner(System.in);
	static String firstName, lastName, address, city, state, zipcode, phone, email;
	public void enterDetails() {
		System.out.println("Enter first name: ");
		firstName = sc.nextLine();
		System.out.println("Enter last name: ");
		lastName = sc.nextLine();
		System.out.println("Enter address: ");
		address = sc.nextLine();
		System.out.println("Enter city: ");
		city = sc.nextLine();
		System.out.println("Enter state: ");
		state = sc.nextLine();
		System.out.println("Enter zip: ");
		zipcode = sc.nextLine();
		System.out.println("Enter phone number: ");
		phone = sc.nextLine();
		System.out.println("Enter email: ");
		email = sc.nextLine();
	}
	public static void main(String[] args) {
		AddressBook addBook = new AddressBook();
		
		System.out.println("Welome to Address Book!!!");
		Executor entDet = new Executor();
		entDet.enterDetails();
		
		ContactDetailsRegex validateDetails = new ContactDetailsRegex();
		if(validateDetails.FirstNameValidation(firstName) && validateDetails.LastNameValidation(lastName) && validateDetails.AddressValidation(address) && validateDetails.CityValidation(city) && validateDetails.StateValidation(state) && validateDetails.ZipcodeValidation(zipcode) && validateDetails.PhoneValidation(phone) && validateDetails.EmailValidation(email)) {
			ContactDetails contact = new ContactDetails(firstName, lastName, address, city, state, zipcode, phone, email);
			addBook.addContact(contact);
			List<ContactDetails> contDet = new ArrayList<>();
			contDet = addBook.showContact();
			for(ContactDetails i : contDet) {
				System.out.println(i);
			}
		}
		else{
			System.out.println("Entered inputs are not validated. Please enter valid inputs.");
		}
	}
}