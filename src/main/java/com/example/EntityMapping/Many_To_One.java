package com.example.EntityMapping;

import com.example.entity.Village;
import com.example.entity.House;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Many_To_One {
	public static void main(String[] args) {

		//Load the Configuration
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		//Open Session
		Session session = factory.openSession();

		//Begin Transaction
		Transaction transaction = session.beginTransaction();

		//Perform operation
		Village village = new Village("GreenField", "Bangluru Urban");

		House house1 = new House("H-101", "Ravi Kumar");
		House house2 = new House("H-102", "Priya Sharma");

		house1.setVillage(village);
		house2.setVillage(village);

		session.persist(house1);
		session.persist(house2);

		//Commit Transaction
		transaction.commit();

		//close session and SessionFactory
		session.close();
		factory.close();

	}
}
