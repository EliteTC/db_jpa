package com.besedkin;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="teachers")
public class Teacher {
	@Id
	@GeneratedValue
	private int teacherId; 

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	@Column(name="firstname")
	private String firstname;

	@Column(name="lastname")
	private String lastname;

	@Column(name="birth_date")
	private Date birthDate;

	@Column(name="cell_phone")
	private String cellphone;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "teacher_fk")
	private List<Cathedra> cathedrals = new ArrayList<Cathedra>();

	public List<Cathedra> getCathedrals() {
		return cathedrals;
	}

	public void setCathedrals(List<Cathedra> cathedrals) {
		this.cathedrals = cathedrals;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "stud_teacher",
	joinColumns = @JoinColumn(name = "teacher_fk"),
	inverseJoinColumns = @JoinColumn(name = "stud_fk"))
	private List<Student> listensTo;
	public List<Student> getStudents() {
		return listensTo;
	}

	public void setStudents(List<Student> students) {
		this.listensTo = students;
	}

	public Teacher (){

	}
	public Teacher(String fname,String lname,Date birthdate,String cellphone){
		this.firstname = fname;
		this.lastname = lname;
		this.birthDate = birthdate;
		this.cellphone = cellphone;
	}
}
