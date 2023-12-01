package com.hibes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mahi {
	public static void main(String[] args) {
EntityManagerFactory a=Persistence.createEntityManagerFactory("dev"); // to load persistence
EntityManager m=a.createEntityManager(); // to perform crud operations
EntityTransaction e=m.getTransaction(); // to perform transaction i,e begin and commit all the above three lines are same and mandatory
Student S=new Student();
S.setId(101);
S.setName("ramu");
S.setAddress("bangalore");
e.begin(); // begin the transaction
m.persist(S);// saving student objects into db
e.commit(); // used to save

}

}
