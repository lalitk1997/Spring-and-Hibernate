package com.day6.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eid;
	private String ename;
	private int salary;
	
	@ElementCollection
	@Embedded
	// Change Table Name
	@JoinTable(name = "empaddress", joinColumns = @JoinColumn(name="emp_id"))
	private Set<Address> addresses=new HashSet<Address>();

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Employee(int eid, String ename, int salary, Set<Address> addresses) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.addresses = addresses;
	}
	
	public Employee() {}
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int eid;
//	private String ename;
//	private int salary;
//	@ElementCollection
//	@Embedded
//	private Set<Address> addresses = new HashSet<>();
//	public int getEid() {
//		return eid;
//	}
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	public Set<Address> getAddresses() {
//		return addresses;
//	}
//	public void setAddresses(Set<Address> addresses) {
//		this.addresses = addresses;
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(addresses, eid, ename, salary);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(addresses, other.addresses) && eid == other.eid && Objects.equals(ename, other.ename)
//				&& salary == other.salary;
//	}
//	public Employee() {}
//	public Employee(int eid, String ename, int salary, Set<Address> addresses) {
//		super();
//		this.eid = eid;
//		this.ename = ename;
//		this.salary = salary;
//		this.addresses = addresses;
//	}
	
	
	// HAS-A RELATIONSHIP Employee -> Address(Multiple)
	// Same Table -> Normalization Issues
//	@Embedded
//	@AttributeOverrides({
//		@AttributeOverride(name = "state", column = @Column(name="HOME_STATE")),
//		@AttributeOverride(name = "city", column = @Column(name="HOME_CITY")),
//		@AttributeOverride(name = "pincode", column = @Column(name="HOME_PINCODE"))
//	})
//	Address homeAddr;
//	@Embedded
//	Address officeAddr;
//	public int getEid() {
//		return eid;
//	}
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	public Address getHomeAddr() {
//		return homeAddr;
//	}
//	public void setHomeAddr(Address homeAddr) {
//		this.homeAddr = homeAddr;
//	}
//	public Address getOfficeAddr() {
//		return officeAddr;
//	}
//	public void setOfficeAddr(Address officeAddress) {
//		this.officeAddr = officeAddress;
//	}
//	public Employee() {
//		
//	}
//	public Employee(int eid, String ename, int salary, Address homeAddr, Address officeAddress) {
//		super();
//		this.eid = eid;
//		this.ename = ename;
//		this.salary = salary;
//		this.homeAddr = homeAddr;
//		this.officeAddr = officeAddress;
//	}
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", homeAddr=" + homeAddr
//				+ ", officeAddress=" + officeAddr + "]";
//	}
	
	
	
	// HAS-A RELATIONSHIP Employee -> Address (Single Address per Employee)
	// Same Table
//	public int getEid() {
//		return eid;
//	}
//	public void setEid(int eid) {
//		this.eid = eid;
//	}
//	public String getEname() {
//		return ename;
//	}
//	public void setEname(String ename) {
//		this.ename = ename;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	public Address getAddr() {
//		return addr;
//	}
//	public void setAddr(Address addr) {
//		this.addr = addr;
//	}
//	@Override
//	public String toString() {
//		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", addr=" + addr + "]";
//	}
//	public Employee(int eid, String ename, int salary, Address addr) {
//		super();
//		this.eid = eid;
//		this.ename = ename;
//		this.salary = salary;
//		this.addr = addr;
//	}
//	
//	public Employee() {
//	}
}
