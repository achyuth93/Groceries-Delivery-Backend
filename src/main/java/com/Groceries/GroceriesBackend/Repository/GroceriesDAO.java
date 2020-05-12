package com.Groceries.GroceriesBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Groceries.GroceriesBackend.model.User;

@Repository
public interface GroceriesDAO extends JpaRepository<User, String> {

}
