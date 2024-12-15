package com.example.One_to_One.Entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String street;
	private String city;
	public Address(long id, String street, String city) 
	{
		super();
		this.id = id;
		this.street = street;
		this.city = city;
	}
	public Address() 
	{
		super();
	}
	@Override
	public int hashCode() 
	{

		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj) 
		{
				return true;
		}
		if (obj == null) 
		{
				return false;
		}
		if (getClass() != obj.getClass()) 
		{
				return false;
		}
		Address other = (Address) obj;
		return Objects.equals(id, other.id);
	}
	public Object getid() 
	{
		
		return id;
	}
	public Object getStreet() 
	{
		
		return street;
	}
	public Object getCity() 
	{
		
		return city;
	}
	public void setStreet(Object street2) 
	{
		// TODO Auto-generated method stub
		
	}
	public void setCity(Object object) 
	{
		// TODO Auto-generated method stub
		
	}
	
	

}