package com.hocoo.actions;

import com.hocoo.pojo.Customer;

public abstract class CustomerAbstractAction {
	public abstract boolean loginCustomer(String email, String password);
	public abstract boolean signupCustomer(String email, String custname, String address,String phoneno, String password);
	public abstract Customer viewCustomer(String email, String password);
}
