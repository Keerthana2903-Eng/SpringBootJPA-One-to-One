package com.example.One_to_One.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	public User(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	}
	public User() {
	super();
	}
	public Object getid() {
		
		return id;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public Object getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		//name=name2;
	}
	public void setAddress(Object address2) {
		// TODO Auto-generated method stub
		//address=address2;
	}
	

}
