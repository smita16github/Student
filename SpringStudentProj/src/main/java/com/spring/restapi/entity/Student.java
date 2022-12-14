package com.spring.restapi.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name = "student_tabl")
@Entity
@Setter
@Getter
@ToString
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String name;

	@Column
	private String location;
	
	// @CreationTimestamp
//@Column(name="Dob")
//private Date dob;

	@UpdateTimestamp
	@Column(name = "updated_doj")
	private Date updatedDoj;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	
	public Student(String name, String location) {
		super();
		this.name = name;
    this.location = location;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", location=" + location + "]";
	}

	

}
