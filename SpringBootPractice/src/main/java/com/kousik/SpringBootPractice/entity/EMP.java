package com.kousik.SpringBootPractice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EMPDetails2", schema = "dbo")
public class EMP {
	
	@Id
	
	private int id;
	
	
	private String empName;
	
	
	private String dipartMent;
	
	
	private double salary;
	
	public EMP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EMP(int id, String empName, String dipartMent ,double salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.dipartMent = dipartMent;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDipartMent() {
		return dipartMent;
	}
	public void setDipartMent(String dipartMent) {
		this.dipartMent = dipartMent;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
