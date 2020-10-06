package com.cg;
import java.util.*;
//UC6
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
		Scanner in = new Scanner(System.in);
		List<AddressBook> book = new ArrayList<AddressBook>();
		Executor entDet = new Executor();
		int a = 5;
		int count = 0;
		int check = 9;
		
		System.out.println("Welome to Address Book!!!");
		
		do {
			System.out.println("Press 8 to add Address Book");
			System.out.println("Press 9 to exit");
			check = in.nextInt();
			
			if(check == 8) {
				AddressBook addBook = new AddressBook();
				book.add(addBook);
				do {
					
					System.out.println("Menu \nPress 1 to Add a contact \nPress 2 to Edit a Contact \nPress 3 to Remove a contact \nPress 4 to View all contact \nPress 5 to Exit");
					a=in.nextInt();
					switch(a) {
					case 1:
						entDet.addDetails();
						count++;
						ContactDetailsRegex validateDetails = new ContactDetailsRegex();
						if(validateDetails.FirstNameValidation(firstName) && validateDetails.LastNameValidation(lastName) && validateDetails.AddressValidation(address) && validateDetails.CityValidation(city) && validateDetails.StateValidation(state) && validateDetails.ZipcodeValidation(zipcode) && validateDetails.PhoneValidation(phone) && validateDetails.EmailValidation(email)) {
							ContactDetails contact = new ContactDetails(firstName, lastName, address, city, state, zipcode, phone, email);
							addBook.addContact(contact);
						}
						else{
							System.out.println("Enetered inputs are not validated. Please enter valid inputs.");
						}
						break;
					
					case 2:
						entDet.editDetails();
						ContactDetailsRegex validateDetails1 = new ContactDetailsRegex();
						if(validateDetails1.FirstNameValidation(firstName1) && validateDetails1.LastNameValidation(lastName1) && validateDetails1.AddressValidation(address1) && validateDetails1.CityValidation(city1) && validateDetails1.StateValidation(state1) && validateDetails1.ZipcodeValidation(zipcode1) && validateDetails1.PhoneValidation(phone1) && validateDetails1.EmailValidation(email1)) {
							ContactDetails contact = new ContactDetails(firstName1, lastName1, address1, city1, state1, zipcode1, phone1, email1);
							addBook.updateContact(contact);
						}
						else{
							System.out.println("Enetered inputs are not validated. Please enter valid inputs.");
						}
						break;
					case 3:
						System.out.println("Enter first name of contact to remove: ");
						String fname= in.nextLine();
						boolean b = addBook.removeContact(fname);
						if(b)
							System.out.println("Contact removed");
						else
							System.out.println("Contact not found");
						break;
					
					case 4:
						List<ContactDetails> contact1 = new ArrayList<ContactDetails>();
						contact1=addBook.showContact();
						for(ContactDetails i : contact1) {
						System.out.println(i);
						}
						break;
				
					case 5: break;
					
					}
			
				}while(a!=5);
			}
		}while(check!=9);
	}
}