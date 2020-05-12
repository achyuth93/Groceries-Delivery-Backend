package com.Groceries.GroceriesBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Groceries.GroceriesBackend.model.User;
import com.Groceries.GroceriesBackend.service.GroceriesService;
import com.Groceries.GroceriesBackend.service.UserNotFoundException;

@RestController
public class GroceriesController {
	
	@Autowired
	private GroceriesService service;
	
	
	@PostMapping("/users")
	public void saveUser(@RequestBody User user) {
		service.saveUser(user);
	}
	
	@GetMapping("/users")
	public User getUser(@RequestParam String uemail,@RequestParam String upwd) throws UserNotFoundException {
		User user=service.getUser(uemail,upwd);
		return user;
	}

}
