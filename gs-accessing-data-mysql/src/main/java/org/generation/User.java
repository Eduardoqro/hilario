package org.generation;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;

  private String firstname;
  
  private String lastname;

  private String email;
  
  private String avatar;
  
  private String password;
  
  private Calendar createdAt;
  
  private Calendar updatedAt;
  
  public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAvatar() {
	return avatar;
}

public void setAvatar(String avatar) {
	this.avatar = avatar;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Calendar getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Calendar createdAt) {
	this.createdAt = createdAt;
}

public Calendar getUpdatedAt() {
	return updatedAt;
}

public void setUpdatedAt(Calendar updatedAt) {
	this.updatedAt = updatedAt;
}



 
}