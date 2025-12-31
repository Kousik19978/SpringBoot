package com.kousik.SpringBootPractice.Service;


import java.util.List;

import com.kousik.SpringBootPractice.Exception.CustomException;
import com.kousik.SpringBootPractice.entity.EMP;
import com.kousik.SpringBootPractice.model.EmpModel;

public interface EMPService {
	public EmpModel getEmpList() ;

	public EmpModel SaveEMP(EMP emp);
	public EmpModel getEMPList();
	public EmpModel updateemployeeDB(int id);
}
