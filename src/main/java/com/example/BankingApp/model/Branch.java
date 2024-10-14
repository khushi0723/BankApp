package com.example.BankingApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Branch {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 private String branchName;
 private String city;
 private String address;
 
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Branch(Long id, String branchName, String city, String address) {
	super();
	this.id = id;
	this.branchName = branchName;
	this.city = city;
	this.address = address;
}
public Branch() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Branch [id=" + id + ", branchName=" + branchName + ", city=" + city + ", address=" + address + "]";
}


 
 // Getters and Setters
}