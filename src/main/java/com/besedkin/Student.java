package com.besedkin;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getPib() {
		return pib;
	}
	public void setPib(String pib) {
		this.pib = pib;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
	public Student(){
		
	}
	public Student(int studId,String pib,int course){
		studentId = studId;
		this.pib = pib;
		this.course = course;
	}
	public Student(String pib,int course){
		this.pib = pib;
		this.course = course;
	}
	@Id
	@GeneratedValue
	@Column(name="id")
	private int studentId;
	private String pib;
	private int course;
	@ManyToMany(mappedBy = "listensTo")
	private List<Teacher> teachers;
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public String toString(){
		return "Student : "+ pib;
	}

}
