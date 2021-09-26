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

	@Override
	public String getCustomerName(String custId) {
		return customerDAO.getCustomerDetailsByEmpId(custId);
	}

	@Override
	public String getLastAccessTime(String custId, String currentAccessTime) {
		return customerDAO.getLastAccessTime(custId, currentAccessTime);
	}
}
