package com.in.kousiK.SpringBootPracticeWithJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.in.kousiK.SpringBootPracticeWithJPA.dao.EmployeeRepository;
import com.in.kousiK.SpringBootPracticeWithJPA.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private  EmployeeRepository repo;

    

    @Transactional
    public Employee save(Employee emp) {
        return repo.save(emp);
    }

    @Transactional(readOnly = true)
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @Transactional(readOnly = true)
    public Employee getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    public Employee update(Long id, Employee emp) {
        Employee existing = repo.findById(id).orElseThrow();
        existing.setName(emp.getName());
        existing.setDepartment(emp.getDepartment());
        existing.setSalary(emp.getSalary());
        return existing;
    }

    @Transactional
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
