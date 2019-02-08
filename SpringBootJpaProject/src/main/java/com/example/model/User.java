package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class User {

	@Id
	@GeneratedValue
	private long uId;
	@Column
	private String uName;
	@Column
	private String uContact;
	@Column
	private String uAddress;
	public String getuContact() {
		return uContact;
	}
	public void setuContact(String uContact) {
		this.uContact = uContact;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
	public long getuId() {
		return uId;
	}
	public void setuId(long uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uContact=" + uContact + ", uAddress=" + uAddress + "]";
	}
	
}
