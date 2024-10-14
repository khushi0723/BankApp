package com.example.BankingApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;




@Entity
public class BankService {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 
 private String ServiceName;

public BankService(Long id, String serviceName) {
	super();
	this.id = id;
	ServiceName = serviceName;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getServiceName() {
	return ServiceName;
}

public void setServiceName(String serviceName) {
	ServiceName = serviceName;
}

public BankService() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "BankService [id=" + id + ", ServiceName=" + ServiceName + "]";
}


 // Getters and Setters
}