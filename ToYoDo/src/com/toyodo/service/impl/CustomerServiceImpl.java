package com.toyodo.service.impl;

import com.toyodo.dao.CustomerDAO;
import com.toyodo.factory.CustomerDAOFactory;
import com.toyodo.model.Customer;
import com.toyodo.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO customerDAO;

	public CustomerServiceImpl() {
		customerDAO = CustomerDAOFactory.getCustomerDAO();
	}

	@Override
	public String customerLogin(Customer customerLogin) {
		return customerDAO.customerLogin(customerLogin);
	}
}
