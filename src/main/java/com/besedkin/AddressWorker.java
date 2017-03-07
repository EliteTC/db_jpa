package com.besedkin;

import org.springframework.beans.factory.annotation.Autowired;

public class AddressWorker {
	@Autowired
	private AddressDao AddressDao;
	public Address addAddress(Address Address){
	AddressDao.addAddress(Address);
	System.out.println("Address has been added "+Address);
	return Address;
	}
	public Address getAddress(int id){
	return AddressDao.getAddress(id);
	}
	public void saveAddress(Address Address){
	AddressDao.saveAddress(Address);
	System.out.println("Address has been saved "+Address);
	}
}
