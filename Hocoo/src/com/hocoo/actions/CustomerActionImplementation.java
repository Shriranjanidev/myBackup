package com.hocoo.actions;

import com.hocoo.dao.CustomerDAO;
import com.hocoo.pojo.Customer;

public class CustomerActionImplementation extends CustomerAbstractAction{
	
	CustomerDAO cd = new CustomerDAO();
	
	@Override
	public boolean loginCustomer(String email, String password) {
		if(cd.validateCustomer(email, password))
			return true;
		return false;
	}
	
	
	@Override
	public boolean signupCustomer(String email, String custname, String address, String phoneno, String password) {
		
		if(cd.doExists(email))
			return false;
		
		Customer customer = new Customer();
		customer.setEmail(email);
		customer.setPassword(password);
		customer.setCustname(custname);
		customer.setAddress(address);
		customer.setPhoneno(phoneno);
		cd.insertCustomer(customer);
		
		return true;
	}

	@Override
	public Customer viewCustomer(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}


	

}
