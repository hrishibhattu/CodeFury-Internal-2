package com.toyodo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.toyodo.dao.CustomerDAO;
import com.toyodo.model.Customer;
import com.toyodo.utils.DBConnection;

/*
 * @author JAVATAR
 * */

public class CustomerDAOImpl implements CustomerDAO {
	private static CustomerDAOImpl customerDAOImpl;
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;

	public static CustomerDAOImpl createObject() {
		if (customerDAOImpl == null) {
			synchronized (CustomerDAOImpl.class) {
				customerDAOImpl = new CustomerDAOImpl();
			}
		}
		return customerDAOImpl;
	}

	@Override
	public void createConnection() {
		con = DBConnection.createConnection();
	}

	@Override
	public String customerLogin(Customer customerLogin) {
		createConnection();
		String credential = "invalid";
		try {
			String strlogin = "SELECT * FROM `customer_login_credential` WHERE (`customer_id` = ? OR `name` = ?) AND `password` = ?";
			ps = con.prepareStatement(strlogin);
			ps.setString(1, customerLogin.getCustomer_id());
			ps.setString(2, customerLogin.getName());
			ps.setString(3, customerLogin.getPassword());
			rs = ps.executeQuery();
			if (rs.next())
				credential = "valid";
		} catch (SQLException sqlex) {
			System.out.println(sqlex);
		} finally {
			closeConnection();
		}
		return credential;

	}

	@Override
	public String getLastAccessTime(String customerId, String currentAccess) {
		String lastLoginTime = "Accessing for first time";
		createConnection();
		try {
			String query = "select logintime from `last_login_details` WHERE `login_id` = ?";
			ps = con.prepareStatement(query);
			ps.setString(1, customerId);
			rs = ps.executeQuery();
			if (rs.next()) {
				lastLoginTime = rs.getString("logintime");
				System.out.println(lastLoginTime + " in dao");// debug
				String updateQuery = "update `last_login_details` set logintime=? where login_id = ?";
				ps = con.prepareStatement(updateQuery);
				ps.setString(1, currentAccess);
				ps.setString(2, customerId);
				ps.executeUpdate();
			} else {
				String currentAccessTime = currentAccess;
				String insQuery = "insert into `last_login_details` values(?,?)";
				ps = con.prepareStatement(insQuery);
				ps.setString(1, customerId);
				ps.setString(2, currentAccessTime);
				ps.execute();
			}
		} catch (SQLException sqlex) {
			System.out.println(sqlex);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return lastLoginTime;
	}

	@Override
	public String getCustomerDetailsByEmpId(String custId) {
		createConnection();
		String customerName = null;
		try {
			String query = "select name from `customer_login_credential` WHERE `customer_id` = ?";
			ps = con.prepareStatement(query);
			ps.setString(1, custId);
			rs = ps.executeQuery();
			if (rs.next()) {
				customerName = rs.getString("name");
				System.out.println(customerName + " in dao");// debug
			}

		} catch (SQLException sqlex) {
			System.out.println(sqlex);
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return customerName;
	}

	@Override
	public void closeConnection() {
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
