package org.gwtbootstrap3.seed.client;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Person implements Serializable, IsSerializable{
	
	private String firstName;
	private String lastName;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}
