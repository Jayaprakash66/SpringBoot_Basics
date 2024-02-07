package edu.jsp.application.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Application{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String Appname;
	private double size;
	private double rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppname() {
		return Appname;
	}
	public void setAppname(String appname) {
		Appname = appname;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
}
