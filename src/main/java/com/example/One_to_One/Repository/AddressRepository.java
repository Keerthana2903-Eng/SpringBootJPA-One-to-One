package com.example.One_to_One.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.One_to_One.Entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
