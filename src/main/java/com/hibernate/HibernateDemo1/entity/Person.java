package com.hibernate.HibernateDemo1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity // this maps to the table
// @Table(name="person") can use this if the names are different
@NamedQuery(name = "find_all_persons", query = "select p from Person p") // this is JPQL uses the entity rather than a sql query
public class Person {

	@Id // need to add this because it is a reference to the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // this allows the primary key to be auto generated and the
														// strategy assignment is auto incremented
	private int id;

	// @Column(name="name") can use this to map column names if they are different
	private String name;
	private String location;

	// always need a no argument constructor
	public Person() {

	}

	// can also generate an overloaded constructor
	public Person(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;

	}

	// ********************************//
	// created this third constructor to allow hibernate to generate the id for me
	public Person(String name, String location) {
		this.name = name;
		this.location = location;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Person :" + id + ", name=" + name + ", location=" + location;
	}

}
