package com.hexaware.Mappings.Entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Address implements Serializable{
	
	//private static final long serialVersionUID=1L;
	@Id
	
private int addressId;
private String  city;
private String state;

public Address() {
	super();
}

public Address(int addressId, String city, String state) {
	super();
	this.addressId = addressId;
	this.city = city;
	this.state = state;
}

public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}

}
