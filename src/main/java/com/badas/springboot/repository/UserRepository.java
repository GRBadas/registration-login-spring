package com.badas.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.badas.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
