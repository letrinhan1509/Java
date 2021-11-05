package com.nicholasle.springbootbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/* Let's use Lombok library to reduce boilerplate code such as getters, setters, constructor, 
 					toString,  equals and hashcode methods for Java class */
@Data
@Entity
@Table(name="employees") /* If you don't provide a table annonation then jps smart enough to 
					provide table name as the name of class*/
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name", nullable = false) // Here's how to map a field to column by using add column annotation
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
}
