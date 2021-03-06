package com.cg;

public class ContactDetails {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String zipcode;
	public String phone;
	public String email;
	
	public ContactDetails() {
		
	}
	
	public ContactDetails(String firstName, String lastName, String address, String city, String state, String zipcode, String phone, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.phone = phone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "FirstName : " + firstName + " LastName : " + lastName + " Address : " + address + " City : " + city
				+ " State : " + state + " Zip : " + zipcode + " Phone No : " + phone + " Email : " + email;
	}
}
