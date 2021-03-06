package com.frota.algohithm.gpsCustomer.model;

import java.io.Serializable;

/**
 * 
 * @author edmundofrota
 *
 */
public class Customer implements Serializable
{

	private static final long serialVersionUID = 7779260779160661839L;
	
	private long id;
	private String name;
	private double latitude;
	private double longitude;
	
	public Customer(){}
	
	public Customer(long id, String name, double latitude, double longitude)
	{
		this();
		this.id = id;
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
