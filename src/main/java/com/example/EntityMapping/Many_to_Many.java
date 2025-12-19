package com.example.EntityMapping;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.KodStudent;
import com.example.entity.Club;

public class Many_to_Many {
	public static void main(String[] args) {

		//Load the Configuration
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		//Open Session
		Session session = factory.openSession();

		//Begin Transaction
		Transaction transaction = session.beginTransaction();

		//Perform operation
		Club club1 = new Club("Science Club");
		Club club2 = new Club("Music Club");
		
		KodStudent student = new KodStudent("Ravi Kumar", "ravi@example.com");
		
		Set<Club> set = new HashSet<Club>();
		set.add(club1);
		set.add(club2);
		
		student.setClubs(set);
		
		session.persist(student);
		
//		session.get(KodStudent.class, 1);

		//Commit Transaction
		transaction.commit();

		//close session and SessionFactory
		session.close();
		factory.close();

	}
}
