package com.in.kousiK.SpringBootPracticeWithJPA.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.kousiK.SpringBootPracticeWithJPA.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}