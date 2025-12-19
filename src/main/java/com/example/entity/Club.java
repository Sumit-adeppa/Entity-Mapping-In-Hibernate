package com.example.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "club")
public class Club {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String club_name;
	
	@ManyToMany(mappedBy = "clubs")
	Set<KodStudent> students;

	public Club() {
		super();
	}

	public Club(String club_name) {
		super();
		this.club_name = club_name;
	}

	public Club(int id, String club_name) {
		super();
		this.id = id;
		this.club_name = club_name;
	}

	public Club(int id, String club_name, Set<KodStudent> students) {
		super();
		this.id = id;
		this.club_name = club_name;
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClub_name() {
		return club_name;
	}

	public void setClub_name(String club_name) {
		this.club_name = club_name;
	}

	public Set<KodStudent> getStudents() {
		return students;
	}

	public void setStudents(Set<KodStudent> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Club [id=" + id + ", club_name=" + club_name + ", students=" + students + "]";
	}
	
}
