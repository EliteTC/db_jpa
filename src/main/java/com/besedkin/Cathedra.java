package com.besedkin;

import javax.persistence.*;

@Entity
@Table(name = "teacher_cathedral")
public class Cathedra {
	@GeneratedValue
	@Id
	private int id;
	private int teacher_fk;
	public int getTeacher_fk() {
		return teacher_fk;
	}
	public void setId(int id){
		this.id = id;
		
	}
	public int getId(){
		return id;
	}
	public void setTeacher_id(int teacher_fk) {
		this.teacher_fk = teacher_fk;
	}
	public String getCathedra() {
		return cathedra;
	}
	public void setCathedra(String cathedra) {
		this.cathedra = cathedra;
	}
	private String cathedra;
	public Cathedra(){
		
	}
	public String toString(){
		return "Cathedra : " + cathedra;
	}
}
