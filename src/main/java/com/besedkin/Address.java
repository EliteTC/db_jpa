package com.besedkin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_address")
public class Address {
	
@GeneratedValue
@Id
private int address_id;
 private String country;
 private String street;
 
 
 public Address(){
	 
 }
 public Address(String country,String street){
	 this.country = country;
	 this.street = street;
 }
 
 public int getId() {
		return address_id;
	}
	public void setId(int id) {
		this.address_id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}
