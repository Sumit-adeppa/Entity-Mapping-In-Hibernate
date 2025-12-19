package com.example.EntityMapping;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.Address;
import com.example.entity.Student;

public class One_To_One {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		//Load the Configuration
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		//Open Session
		Session session = factory.openSession();

		//Begin Transaction
		Transaction transaction = session.beginTransaction();

		//Perform operation
		System.out.println("Enter Address Details {Street, City, State, Pincode}: ");
		Address address = new Address(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt());
		
		System.out.println("Enter the Student Details {Name, Email, Phone}: ");
		Student student = new Student(scanner.next(), scanner.next(), scanner.nextInt());
		student.setAddr(address);
		
		session.persist(student);

		//Commit Transaction
		transaction.commit();

		//close session and SessionFactory
		session.close();
		factory.close();
		
		scanner.close();

	}
}
