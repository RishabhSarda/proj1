package com.testing.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testing.app.dto.UserTable;

@Repository
public interface UserRepository extends JpaRepository<UserTable,Integer>{
	
	public List<UserTable> findAll();

}
