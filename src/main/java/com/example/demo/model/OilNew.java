package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OilNew {
	
	@Id
	@GeneratedValue	
	private int id;
	private String country;
	@Column(name = "MY")
	private String MYDate;
	private int value;
	
	public OilNew(int id, String country, String MYDate, int value) {
		super();
		this.id = id;
		this.country = country;
		this.MYDate = MYDate;
		this.value = value;
	}

	protected OilNew() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getMYDate() {
		return MYDate;
	}

	public void setMYDate(String MYDate) {
		this.MYDate = MYDate;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "OilNew [id=" + id + ", country=" + country + ", MYDate=" + MYDate + ", value=" + value + "]";
	}
	
	
	

}
