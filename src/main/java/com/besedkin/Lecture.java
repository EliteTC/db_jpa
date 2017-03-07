package com.besedkin;

import javax.persistence.*;

@Entity
@Table(name="Lectures")
public class Lecture {
@Id
@GeneratedValue
@Column(name = "ID")
private int id;

private String name;
private double credits;

public Lecture(){
	
}
public Lecture(String name,double credits){
	this.name = name;
	this.credits = credits;
}
//Getters and settings
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getCredits() {
	return credits;
}
public void setCredits(double credits) {
	this.credits = credits;
}
}

