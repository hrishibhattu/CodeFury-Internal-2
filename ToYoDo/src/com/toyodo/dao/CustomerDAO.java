package com.toyodo.dao;

import java.util.List;

import com.toyodo.model.Customer;
import com.toyodo.model.Order;
import com.toyodo.model.Quote;

public interface CustomerDAO {
	void createConnection();

	String customerLogin(Customer customerLogin);

//	List<Quote> viewQuote();
//	List<Order> listOrder();
	void closeConnection();

	String getLastAccessTime(String customerId, String currentAccessTime);

	String getCustomerDetailsByEmpId(String custId);
}
