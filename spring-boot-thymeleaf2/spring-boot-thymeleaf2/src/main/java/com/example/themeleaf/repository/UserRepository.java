package com.example.themeleaf.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.themeleaf.model.User;

public interface UserRepository extends CrudRepository<User, Long>
{

	String save = null;

}
