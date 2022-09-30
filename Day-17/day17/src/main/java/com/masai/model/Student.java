package com.masai.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roll;
	private String name;
	private Integer marks;
	
	// Has-A Relationship
	@Embedded
	private Address address;
	// Many To Many (Bi-directional) Mapping
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Course> courses = new HashSet<>();
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public Student(Integer roll, String name, Integer marks, Address address, Set<Course> courses) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
		this.courses = courses;
	}
	public Student() {
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, marks, name, roll);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(marks, other.marks)
				&& Objects.equals(name, other.name) && Objects.equals(roll, other.roll);
	}
	
	
	
}
