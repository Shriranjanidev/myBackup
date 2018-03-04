package com.hocoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hocoo.connection.DBConnection;
import com.hocoo.pojo.Customer;

public class CustomerDAO {
	
	public static final String INSERT_CUSTOMER_QUERY = "";
	public static final String CHECK_CUSTOMER_QUERY = "";	
	public static final String VALIDATE_CUSTOMER_QUERY = "";		
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public boolean insertCustomer(Customer customer) {
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(INSERT_CUSTOMER_QUERY);
			int success = ps.executeUpdate();
			
			if(success == 1) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean doExists(String email) {
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(CHECK_CUSTOMER_QUERY);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean validateCustomer(String email, String password) {
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement(VALIDATE_CUSTOMER_QUERY);
			ps.setString(1, email);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			if(rs.next())
				return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
}
