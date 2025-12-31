package com.kousik.SpringBootPractice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kousik.SpringBootPractice.entity.EMP;

public interface EMPDao extends JpaRepository<EMP, Integer>{

}
