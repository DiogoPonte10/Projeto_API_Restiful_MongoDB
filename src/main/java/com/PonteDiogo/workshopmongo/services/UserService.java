package com.PonteDiogo.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PonteDiogo.workshopmongo.domain.User;
import com.PonteDiogo.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
	return repo.findAll();	
	}
}
