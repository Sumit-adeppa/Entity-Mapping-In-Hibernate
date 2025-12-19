package com.example.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "kodstudent")
public class KodStudent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String name;
	
	@Column
	String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_club", // Bridge table name
	joinColumns = @JoinColumn(name = "student_id"), // foreign key for kodstudent
	inverseJoinColumns = @JoinColumn(name= "club_id") // foreign key for club
	)
	Set<Club> clubs;

	public KodStudent() {
		super();
	}

	public KodStudent(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public KodStudent(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public KodStudent(int id, String name, String email, Set<Club> clubs) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.clubs = clubs;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Club> getClubs() {
		return clubs;
	}

	public void setClubs(Set<Club> clubs) {
		this.clubs = clubs;
	}

	@Override
	public String toString() {
		return "KodStudent [id=" + id + ", name=" + name + ", email=" + email + ", clubs=" + clubs + "]";
	}
	
}
