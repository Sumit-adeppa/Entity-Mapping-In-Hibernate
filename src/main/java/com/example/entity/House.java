package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "house")
public class House {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "house_number")
	String houseNumber;
	
	@Column(name = "owner_name")
	String ownerName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "village_id", referencedColumnName = "id")
	Village village;

	public House() {
		super();
	}

	public House(String houseNumber, String ownerName) {
		super();
		this.houseNumber = houseNumber;
		this.ownerName = ownerName;
	}

	public House(int id, String houseNumber, String ownerName) {
		super();
		this.id = id;
		this.houseNumber = houseNumber;
		this.ownerName = ownerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public Village getVillage() {
		return village;
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", houseNumber=" + houseNumber + ", ownerName=" + ownerName + ", village=" + village
				+ "]";
	}
	
}
