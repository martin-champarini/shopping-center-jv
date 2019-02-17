package com.shopping.center.jv.shoppingcenterjv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.center.jv.shoppingcenterjv.model.User;

public interface UserRepository extends JpaRepository<User, String> {
}
