package com.tut.Project1WithHibernate;
import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient; 	
@Entity
@Table(name="Student_address")
public class address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressid;
	@Column(length=50,name="STREET")
	private String street;
	@Column(length=100,name="CITY")
	private String city;
	@Column(name="is_open")
	private boolean isopen;
	@Transient
	private double x;
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	private byte[] images;
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}
	public byte[] getImages() {
		return images;
	}
	public void setImages(byte[] images) {
		this.images = images;
	}
	@Override
	public String toString() {
		return "address [addressid=" + addressid + ", street=" + street + ", city=" + city + ", isopen=" + isopen
				+ ", x=" + x + ", addedDate=" + addedDate + ", images=" + Arrays.toString(images) + "]";
	}
	public address(int addressid, String street, String city, boolean isopen, double x, Date addedDate, byte[] images) {
		super();
		this.addressid = addressid;
		this.street = street;
		this.city = city;
		this.isopen = isopen;
		this.x = x;
		this.addedDate = addedDate;
		this.images = images;
	}
	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
