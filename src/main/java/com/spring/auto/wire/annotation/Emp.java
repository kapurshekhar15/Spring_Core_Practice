package com.spring.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
//	@Autowired
	private Address address;

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address1")
	public void setAddress(Address address) {
		System.out.println("setting value");
		this.address = address;
	}
	
 // @Autowired
  
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("using constructor...!!!");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
     
	
}
