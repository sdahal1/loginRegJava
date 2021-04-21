package com.instructorrob.loginRegDemo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.instructorrob.loginRegDemo.models.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);

}
