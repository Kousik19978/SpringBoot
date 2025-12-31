package com.in.kousiK.SpringBootPracticeWithJPA.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.kousiK.SpringBootPracticeWithJPA.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long> {

}
