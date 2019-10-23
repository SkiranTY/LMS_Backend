package com.tyss.tysslibrary.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.tyss.tysslibrary.dto.Books;

@Repository
public class LibrarianDaoImplementation implements LibrarianDao {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addbook(Books books) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		System.out.println(books.getbAuthor());
		try {
			transaction.begin();
			manager.persist(books);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ArrayList<Books> getAllbooks() {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql = "From Books";
		Query query = manager.createQuery(jpql);
		ArrayList<Books> book1=(ArrayList<Books>) query.getResultList();
			return book1;
	}

	@Override
	public boolean removebook(int bId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Books book1=manager.find(Books.class, bId);
			manager.remove(book1);
			transaction.commit();
			return true;
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ArrayList<Books> searchbooks(String bName) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		String jpql="From Books where bName like %bName%";
		Query query=manager.createQuery(jpql);
		ArrayList<Books> books=(ArrayList<Books>) query.getResultList();
		return books;
	}

	
}
