package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OilBase {
	
	@Id
	@GeneratedValue	
	private int id;
	private String Country;
	private int Jul2021;
	private int Jun2021;
	private int Aug2021;
	private int Sep2021;
	private int Oct2021;
	private int Nov2021;
	private int Dec2021;
	private int Jan2022;
	private int Feb2022;
	private int Mar2022;
	private int Apr2022;
	private int May2022;
	private int Jul2022;
	private int Jun2022;
	private int Aug2022;
	private int Sep2022;
	

	protected OilBase() {
		super();
	}
	
	
	public OilBase(int id, String country, int jul2021, int jun2021, int aug2021, int sep2021, int oct2021, int nov2021,
			int dec2021, int jan2022, int feb2022, int mar2022, int apr2022, int may2022, int jul2022, int jun2022,
			int aug2022, int sep2022) {
		super();
		this.id = id;
		Country = country;
		Jul2021 = jul2021;
		Jun2021 = jun2021;
		Aug2021 = aug2021;
		Sep2021 = sep2021;
		Oct2021 = oct2021;
		Nov2021 = nov2021;
		Dec2021 = dec2021;
		Jan2022 = jan2022;
		Feb2022 = feb2022;
		Mar2022 = mar2022;
		Apr2022 = apr2022;
		May2022 = may2022;
		Jul2022 = jul2022;
		Jun2022 = jun2022;
		Aug2022 = aug2022;
		Sep2022 = sep2022;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public int getJul2021() {
		return Jul2021;
	}
	public void setJul2021(int jul2021) {
		Jul2021 = jul2021;
	}
	public int getJun2021() {
		return Jun2021;
	}
	public void setJun2021(int jun2021) {
		Jun2021 = jun2021;
	}
	public int getAug2021() {
		return Aug2021;
	}
	public void setAug2021(int aug2021) {
		Aug2021 = aug2021;
	}
	public int getSep2021() {
		return Sep2021;
	}
	public void setSep2021(int sep2021) {
		Sep2021 = sep2021;
	}
	public int getOct2021() {
		return Oct2021;
	}
	public void setOct2021(int oct2021) {
		Oct2021 = oct2021;
	}
	public int getNov2021() {
		return Nov2021;
	}
	public void setNov2021(int nov2021) {
		Nov2021 = nov2021;
	}
	public int getDec2021() {
		return Dec2021;
	}
	public void setDec2021(int dec2021) {
		Dec2021 = dec2021;
	}
	public int getJan2022() {
		return Jan2022;
	}
	public void setJan2022(int jan2022) {
		Jan2022 = jan2022;
	}
	public int getFeb2022() {
		return Feb2022;
	}
	public void setFeb2022(int feb2022) {
		Feb2022 = feb2022;
	}
	public int getMar2022() {
		return Mar2022;
	}
	public void setMar2022(int mar2022) {
		Mar2022 = mar2022;
	}
	public int getApr2022() {
		return Apr2022;
	}
	public void setApr2022(int apr2022) {
		Apr2022 = apr2022;
	}
	public int getMay2022() {
		return May2022;
	}
	public void setMay2022(int may2022) {
		May2022 = may2022;
	}
	public int getJul2022() {
		return Jul2022;
	}
	public void setJul2022(int jul2022) {
		Jul2022 = jul2022;
	}
	public int getJun2022() {
		return Jun2022;
	}
	public void setJun2022(int jun2022) {
		Jun2022 = jun2022;
	}
	public int getAug2022() {
		return Aug2022;
	}
	public void setAug2022(int aug2022) {
		Aug2022 = aug2022;
	}
	public int getSep2022() {
		return Sep2022;
	}
	public void setSep2022(int sep2022) {
		Sep2022 = sep2022;
	}


	@Override
	public String toString() {
		return "OilBase [id=" + id + ", Country=" + Country + ", Jul2021=" + Jul2021 + ", Jun2021=" + Jun2021
				+ ", Aug2021=" + Aug2021 + ", Sep2021=" + Sep2021 + ", Oct2021=" + Oct2021 + ", Nov2021=" + Nov2021
				+ ", Dec2021=" + Dec2021 + ", Jan2022=" + Jan2022 + ", Feb2022=" + Feb2022 + ", Mar2022=" + Mar2022
				+ ", Apr2022=" + Apr2022 + ", May2022=" + May2022 + ", Jul2022=" + Jul2022 + ", Jun2022=" + Jun2022
				+ ", Aug2022=" + Aug2022 + ", Sep2022=" + Sep2022 + "]";
	}
	
	



}
