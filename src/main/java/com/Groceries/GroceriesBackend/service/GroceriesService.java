package com.Groceries.GroceriesBackend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Groceries.GroceriesBackend.Repository.GroceriesDAO;
import com.Groceries.GroceriesBackend.model.User;

@Service
public class GroceriesService {
	
	@Autowired
	private GroceriesDAO dao;

	public void saveUser(User user) {
		dao.save(user);	
	}

	public User getUser(String uemail, String upwd) throws UserNotFoundException {
	Optional<User>	user=dao.findById(uemail);
	if(user.isPresent()) {
		return user.get();
	}
	   throw new UserNotFoundException("User email/Password is Not Valid");
	}

}
