package com.kousik.SpringBootPractice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kousik.SpringBootPractice.Service.EMPService;
import com.kousik.SpringBootPractice.entity.EMP;
import com.kousik.SpringBootPractice.model.EmpModel;

@RestController
@RequestMapping ("/home")
public class EmployeController {
	
	@Autowired
	private EMPService eMPService;

	@GetMapping
	public String welcome() {
		return "Welcome...";
	}
	
	@GetMapping("/empList")
	public ResponseEntity<?>  getEmpList() {
		
		EmpModel response = eMPService.getEmpList();
		if(response != null) {
			return  ResponseEntity.status(HttpStatus.OK).body(response);
		}else {
			return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
		}
	}
	
	@PostMapping ("/save-employee_DB")
	public ResponseEntity<?>  saveemployeeDB(@RequestBody EMP emp) {
		
		EmpModel response = eMPService.SaveEMP(emp);
	    return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
//	@GetMapping ("/get-employee_DB")
//	public ResponseEntity<?>  getemployeeDB() {
//		
//		EmpModel response = eMPService.getEMPList();
//	    return ResponseEntity.status(HttpStatus.OK).body(response);
//	}
	
	@PutMapping ("/update-employee_DB/{id}")
	public ResponseEntity<?>  updateemployeeDB(@PathVariable  int id) {
		
		EmpModel response = eMPService.updateemployeeDB(id);
	    return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	//Test
	
}
