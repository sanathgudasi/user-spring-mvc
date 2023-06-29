package com.ripplestreet.usermvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.ripplestreet.usermvc.dto.User;

@Repository
public class UserDao {
	
	public User save(User user) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
		return user;
	}
	
	public List<User> view() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("user_details");
		EntityManager manager = factory.createEntityManager();
		javax.persistence.Query query =  manager.createQuery("select u from User u");
		return query.getResultList();
	}

}
