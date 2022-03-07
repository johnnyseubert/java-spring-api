package com.projetospring.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projetospring.userdept.entities.User;
import com.projetospring.userdept.repositories.UserRepository;

@RestController //diz que vai ser um controller
@RequestMapping(value = "/users") //controller para esta url
public class UserController {

	@Autowired //faz com já seja instanciado o item com injeção de dependencia
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll(){
		return repository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public User insert(@RequestBody User user) {
		return repository.save(user);
	}
}
