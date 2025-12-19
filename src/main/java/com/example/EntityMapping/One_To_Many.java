package com.example.EntityMapping;

import java.util.Arrays;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.Course;
import com.example.entity.Kodneststudent;

public class One_To_Many {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		System.out.println("Enter Student Name Email Phone:");
		Kodneststudent student = new Kodneststudent(scanner.next(), scanner.next(), scanner.nextInt());

		Course course1 = new Course("Java");
		Course course2 = new Course("Spring Boot");

		//Connect both sides properly
		student.setCourses(Arrays.asList(course1, course2));

		// Only ONE persist needed due to cascade
		session.persist(student);

		transaction.commit();

		session.close();
		factory.close();
		scanner.close();
	}
}
