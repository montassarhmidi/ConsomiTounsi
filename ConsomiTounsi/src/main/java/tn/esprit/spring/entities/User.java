package tn.esprit.spring.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;







@Entity(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public  class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private boolean actived;
    private String email;
    //erreur hethy el eager t5arej fi erreur!! fetch = FetchType.EAGER
      @ManyToMany()
    private Collection<Role> roles=new ArrayList<>();



@OneToMany(cascade = CascadeType.ALL, mappedBy="user")
private Set<Product> product;
@OneToMany(cascade = CascadeType.ALL, mappedBy="user")
private Set<Rating> rating;
@OneToMany(cascade = CascadeType.ALL, mappedBy="user")
private Set<Coupon> coupon;
@OneToMany(cascade = CascadeType.ALL, mappedBy="user")
private Set<Add> add;
@OneToMany(cascade = CascadeType.ALL, mappedBy="user")
private Set<ADDView> view;
@OneToMany(cascade = CascadeType.ALL, mappedBy="users")
private Set<Reclamation> reclamations;
@OneToMany(cascade = CascadeType.ALL, mappedBy="users")
private Set<Comment> comments;
@OneToMany(cascade = CascadeType.ALL, mappedBy="users")
private Set<Exchange> exchanges;



public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public boolean isActived() {
	return actived;
}
public void setActived(boolean actived) {
	this.actived = actived;
}
public Collection<Role> getRoles() {
	return roles;
}
public void setRoles(Collection<Role> roles) {
	this.roles = roles;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Set<Product> getProduct() {
	return product;
}
public void setProduct(Set<Product> products) {
	this.product = products;
}
public Set<Rating> getRating() {
	return rating;
}
public void setRating(Set<Rating> ratings) {
	this.rating = ratings;
}
public Set<Coupon> getCoupon() {
	return coupon;
}
public void setCoupon(Set<Coupon> coupons) {
	this.coupon = coupons;
}

public Set<Add> getAdd() {
	return add;
}
public void setAdd(Set<Add> add) {
	this.add = add;
}
public Set<ADDView> getView() {
	return view;
}
public void setView(Set<ADDView> view) {
	this.view = view;
}
@JsonIgnore
public Set<Reclamation> getReclamations() {
	return reclamations;
}
public void setReclamations(Set<Reclamation> reclamations) {
	this.reclamations = reclamations;
}

public Set<Comment> getComments() {
	return comments;
}
public void setComments(Set<Comment> comments) {
	this.comments = comments;
}

@JsonIgnore
public Set<Exchange> getExchanges() {
	return exchanges;
}
public void setExchanges(Set<Exchange> exchanges) {
	this.exchanges = exchanges;
}

public User(Long id, String username, String password, boolean actived, Collection<Role> roles, Set<Product> products,
		Set<Rating> ratings, Set<Coupon> coupons, Set<Add> adds, Set<ADDView> views, Set<Reclamation> reclamations,
		Set<Comment> comments, Set<Donation> donations, Set<Participation> participations) {



	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.actived = actived;
	this.roles = roles;
	this.product = products;
	this.rating = ratings;
	this.coupon = coupons;
	this.add = adds;
	this.view = views;
	this.reclamations = reclamations;
	this.comments = comments;
	this.donations = donations;
	this.participations = participations;
}


public User() {
	super();
	// TODO Auto-generated constructor stub
}


@OneToMany(cascade = CascadeType.ALL, mappedBy="user")
private Set<Donation> donations;

@OneToMany(cascade = CascadeType.ALL, mappedBy="userpr")
private Set<Participation> participations;
@OneToMany(cascade = CascadeType.ALL, mappedBy="client")
private Set<Command> command;


public Set<Donation> getDonations() {
	return donations;
}
public void setDonations(Set<Donation> donations) {
	this.donations = donations;
}
public Set<Participation> getParticipations() {
	return participations;
}
public void setParticipations(Set<Participation> participations) {
	this.participations = participations;
}
public Set<Command> getCommand() {
	return command;
}
public void setCommand(Set<Command> command) {
	this.command = command;
}
@Override
public String toString() {
	return "User [id=" + id + ", username=" + username + ", password=" + password + ", actived=" + actived + ", roles="
			+ roles + ", product=" + product + ", rating=" + rating + ", coupon=" + coupon + ", add=" + add + ", view="
			+ view + ", reclamations=" + reclamations + ", comments=" + comments + ", exchanges=" + exchanges
			+ ", donations=" + donations + ", participations=" + participations + ", command=" + command + "]";
}
public User(Long id, String username, String password, boolean actived, Collection<Role> roles, Set<Product> product,
		Set<Rating> rating, Set<Coupon> coupon, Set<Add> add, Set<ADDView> view, Set<Reclamation> reclamations,
		Set<Comment> comments, Set<Exchange> exchanges, Set<Donation> donations, Set<Participation> participations,
		Set<Command> command) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
	this.actived = actived;
	this.roles = roles;
	this.product = product;
	this.rating = rating;
	this.coupon = coupon;
	this.add = add;
	this.view = view;
	this.reclamations = reclamations;
	this.comments = comments;
	this.exchanges = exchanges;
	this.donations = donations;
	this.participations = participations;
	this.command = command;
}






	


}
