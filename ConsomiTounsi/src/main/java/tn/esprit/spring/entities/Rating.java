package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Rating implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int id ;

@Temporal (TemporalType.DATE)
private Date DateRating;
private int note ;
private String review ;

@ManyToOne
Product product;
@ManyToOne
User users ;

@Override
public String toString() {
	return "Rating [id=" + id + ", DateRating=" + DateRating + ", note=" + note + ", review=" + review + "]";
}

public Rating(int id, Date dateRating, int note, String review) {
	super();
	this.id = id;
	DateRating = dateRating;
	this.note = note;
	this.review = review;
}

public Rating() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Date getDateRating() {
	return DateRating;
}

public void setDateRating(Date dateRating) {
	DateRating = dateRating;
}

public int getNote() {
	return note;
}

public void setNote(int note) {
	this.note = note;
}

public String getReview() {
	return review;
}

public void setReview(String review) {
	this.review = review;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}

public User getUsers() {
	return users;
}

public void setUsers(User users) {
	this.users = users;
}



}
