package com.hibernate.HibernateDemo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibernate.HibernateDemo1.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer>{

}
