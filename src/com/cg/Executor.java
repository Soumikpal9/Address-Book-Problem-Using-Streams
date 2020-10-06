package com.cg;
import java.util.*;
//UC2
public class Executor {
	Scanner sc = new Scanner(System.in);
	static String firstName, lastName, address, city, state, zipcode, phone, email;
	static String firstName1, lastName1, address1, city1, state1, zipcode1, phone1, email1;
	public void addDetails() {
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
	public void editDetails() {
		System.out.println("Enter first name: ");
		firstName1 = sc.nextLine();
		System.out.println("Enter last name: ");
		lastName1 = sc.nextLine();
		System.out.println("Enter address: ");
		address1 = sc.nextLine();
		System.out.println("Enter city: ");
		city1 = sc.nextLine();
		System.out.println("Enter state: ");
		state1 = sc.nextLine();
		System.out.println("Enter zip: ");
		zipcode1 = sc.nextLine();
		System.out.println("Enter phone number: ");
		phone1 = sc.nextLine();
		System.out.println("Enter email: ");
		email1 = sc.nextLine();
	}
	public static void main(String[] args) {
		AddressBook addBook = new AddressBook();
		
		System.out.println("Welome to Address Book!!!");
		Executor entDet = new Executor();
		entDet.addDetails();
		
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
		
		System.out.println("Update contact: Enter name and all the details to update");
		entDet.editDetails();
		
		if(validateDetails.FirstNameValidation(firstName1) && validateDetails.LastNameValidation(lastName1) && validateDetails.AddressValidation(address1) && validateDetails.CityValidation(city1) && validateDetails.StateValidation(state1) && validateDetails.ZipcodeValidation(zipcode1) && validateDetails.PhoneValidation(phone1) && validateDetails.EmailValidation(email1)) {
			ContactDetails contact = new ContactDetails(firstName1, lastName1, address1, city1, state1, zipcode1, phone1, email1);
			addBook.updateContact(contact);
			List<ContactDetails> contDet = new ArrayList<>();
			contDet = addBook.showContact();
			for(ContactDetails i : contDet) {
				System.out.println(i);
			}
		}
		else{
			System.out.println("Enetered inputs are not validated. Please enter valid inputs.");
		}
	}
}