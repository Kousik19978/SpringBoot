package com.in.kousiK.SpringBootPracticeWithJPA.service;

import java.util.List;

import com.in.kousiK.SpringBootPracticeWithJPA.entity.Employee;

public interface EmployeeService {

	public Employee save(Employee emp);
	public List<Employee> getAll();
	public Employee getById(Long id);
	public Employee update(Long id, Employee emp) ;
	public void delete(Long id);
}
