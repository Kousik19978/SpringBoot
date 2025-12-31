package com.kousik.SpringBootPractice.model;

import java.util.List;

import com.kousik.SpringBootPractice.entity.EMP;

public class EmpModel {
	private List<EMP> empList;
	private String status;
	private String message;
	private String exception;
	private EMP emp;
	
	public List<EMP> getEmpList() {
		return empList;
	}
	public void setEmpList(List<EMP> empList) {
		this.empList = empList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public EMP getEmp() {
		return emp;
	}
	public void setEmp(EMP emp) {
		this.emp = emp;
	}
	

}
