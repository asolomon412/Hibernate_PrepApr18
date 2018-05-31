package com.hibernate.HibernateDemo1.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.hibernate.HibernateDemo1.entity.Customers;

@Repository
@Transactional
public class CustomersJpaDao {

	@PersistenceContext
	EntityManager entityManager;

	public Customers findByName(String name) {

		return entityManager.find(Customers.class, name);
	}

}
