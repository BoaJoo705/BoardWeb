package com.springbook.ioc.injection;

import java.util.Map;
import java.util.Set;

public class CollectionBean {
	private Map<String ,String> addressList;
	
	public void setAddressList(Map<String, String>addressList) {
		this.addressList = addressList;
	}
	public Map<String ,String> getAddressList(){
		return addressList;
	}
}
