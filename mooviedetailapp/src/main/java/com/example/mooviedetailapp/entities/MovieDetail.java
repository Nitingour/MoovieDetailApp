package com.example.mooviedetailapp.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mooviedetail")
public class MovieDetail {
@Id
int mid;
String details;
int rating;
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}


}
