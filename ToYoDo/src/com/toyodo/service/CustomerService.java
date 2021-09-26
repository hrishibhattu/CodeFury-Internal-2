package com.toyodo.service;

import com.toyodo.model.Customer;

public interface CustomerService {
	String customerLogin(Customer customerLogin);
	public String getCustomerName(String custId);
 	String getLastAccessTime(String custId, String currentAccessTime);
}
