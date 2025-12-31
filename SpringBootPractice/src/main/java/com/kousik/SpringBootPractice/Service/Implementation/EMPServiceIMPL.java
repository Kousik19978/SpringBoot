package com.kousik.SpringBootPractice.Service.Implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.kousik.SpringBootPractice.Exception.CustomException;
import com.kousik.SpringBootPractice.Repository.EMPDao;
import com.kousik.SpringBootPractice.Service.EMPService;
import com.kousik.SpringBootPractice.entity.EMP;
import com.kousik.SpringBootPractice.model.EmpModel;

import jakarta.transaction.Transactional;

@Service
public class EMPServiceIMPL implements EMPService {

	@Autowired
	private EMPDao empdao;

	@Override
	public EmpModel getEmpList() {

		EmpModel empModel= new EmpModel (); 
		List<EMP> empList = new ArrayList<>();

		empList.add( new EMP( 1,"Kousik","IT",1.0));
		empList.add(new EMP( 2,"Mondal","Software",2.0));

		String s=null;
		//		System.out.println(s.length());

		//		if(s== null) {
		//		 throw new CustomException("CustomException Test");
		//		}


		if(empList!=null && empList.size()>0) {
			empModel.setEmpList(empList);

		}else {
			empModel.setStatus("No Data available");
		}

		return empModel;
	}

	@Override
	@Transactional
	public EmpModel SaveEMP(EMP emp) {
		EmpModel empModel= new EmpModel (); 
		//		String s=null;
		//		System.out.println(s.length());

		System.out.println(emp);

		if (empdao.existsById(emp.getId())) {
			throw new CustomException("Employee ID already exists!");
		}else {
			empdao.saveAndFlush(emp);

			empModel.setEmp(emp);
		}


		return empModel;

	}

	
	@Override
	public EmpModel getEMPList() {
		EmpModel empModel= new EmpModel (); 

		empModel.setEmpList(empdao.findAll());

		return empModel;
	}

	@Override
	public EmpModel updateemployeeDB(int id) {
		// TODO Auto-generated method stub
		return null;
	}




}
