package com.example.One_to_One.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.One_to_One.Entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}
