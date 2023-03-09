package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoodDelivery {
	@Id
	private int Id;
	private String foodname;
	private String CustomerName;
	private String CustomerAddress;
	private String PhoneNumber;
	public FoodDelivery(int id, String foodname, String customerName, String customerAddress, String phoneNumber) {
		super();
		Id = id;
		this.foodname = foodname;
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		PhoneNumber = phoneNumber;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public FoodDelivery() {
		super();
		// TODO Auto-generated constructor stub
	}

}
