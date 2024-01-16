package com.ty.cache;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FirstLevelCache {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager1=entityManagerFactory.createEntityManager();
		EntityManager entityManager2=entityManagerFactory.createEntityManager();

		//EntityTransaction entityTransaction2=entityManager1.getTransaction();
		
		Student1 s1=entityManager1.find(Student1.class, 1);
		System.out.println(s1);
		System.out.println("-------------");
		Student1 s2=entityManager2.find(Student1.class, 2);
		System.out.println(s2);
		System.out.println("-------------");
		Student1 s4=entityManager2.find(Student1.class, 1);
		System.out.println(s4);

		
		
		

		

}
}