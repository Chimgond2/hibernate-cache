package com.ty.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.PerConnectionLRUFactory;

public class save {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager1=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager1.getTransaction();
		
		Student1 student=new Student1();
		student.setId(2);
		student.setName("neeraj");
		
		entityTransaction.begin();
		entityManager1.persist(student);
		entityTransaction.commit();
		
		
		
	}

}
