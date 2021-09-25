package com.toyodo.model;

import java.sql.Date;

public class Quote {
	private Date order_date;
	private String customer_id;
	private String customer_name;
	private String customer_gst_no;
	private String customer_shipping_address;
	private String customer_city;
	private String customer_phone_number;
	private String customer_email;
	private int customer_pincode;
	private double shipping_cost;
	private double total_order_value;
	private String status;

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_gst_no() {
		return customer_gst_no;
	}

	public void setCustomer_gst_no(String customer_gst_no) {
		this.customer_gst_no = customer_gst_no;
	}

	public String getCustomer_shipping_address() {
		return customer_shipping_address;
	}

	public void setCustomer_shipping_address(String customer_shipping_address) {
		this.customer_shipping_address = customer_shipping_address;
	}

	public String getCustomer_city() {
		return customer_city;
	}

	public void setCustomer_city(String customer_city) {
		this.customer_city = customer_city;
	}

	public String getCustomer_phone_number() {
		return customer_phone_number;
	}

	public void setCustomer_phone_number(String customer_phone_number) {
		this.customer_phone_number = customer_phone_number;
	}

	public String getCustomer_email() {
		return customer_email;
	}

	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}

	public int getCustomer_pincode() {
		return customer_pincode;
	}

	public void setCustomer_pincode(int customer_pincode) {
		this.customer_pincode = customer_pincode;
	}

	public double getShipping_cost() {
		return shipping_cost;
	}

	public void setShipping_cost(double shipping_cost) {
		this.shipping_cost = shipping_cost;
	}

	public double getTotal_order_value() {
		return total_order_value;
	}

	public void setTotal_order_value(double total_order_value) {
		this.total_order_value = total_order_value;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Quote(Date order_date, String customer_id, String customer_name, String customer_gst_no,
			String customer_shipping_address, String customer_city, String customer_phone_number, String customer_email,
			int customer_pincode, double shipping_cost, double total_order_value, String status) {
		super();
		this.order_date = order_date;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_gst_no = customer_gst_no;
		this.customer_shipping_address = customer_shipping_address;
		this.customer_city = customer_city;
		this.customer_phone_number = customer_phone_number;
		this.customer_email = customer_email;
		this.customer_pincode = customer_pincode;
		this.shipping_cost = shipping_cost;
		this.total_order_value = total_order_value;
		this.status = status;
	}

}
