package com.toyodo.model;

public class Customer {
	private String customer_id;
	private String name;
	private String password;
	private String gst_number;
	private String city;
	private String email;
	private String phone;
	private int pincode;

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGst_number() {
		return gst_number;
	}

	public String getCity() {
		return city;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public int getPincode() {
		return pincode;
	}

	public Customer(String customer_id, String name, String password) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.password = password;
	}

	public Customer(String customer_id, String name, String password, String gst_number, String city, String email,
			String phone, int pincode) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.password = password;
		this.gst_number = gst_number;
		this.city = city;
		this.email = email;
		this.phone = phone;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", password=" + password + ", gst_number="
				+ gst_number + ", city=" + city + ", email=" + email + ", phone=" + phone + ", pincode=" + pincode
				+ "]";
	}

}
