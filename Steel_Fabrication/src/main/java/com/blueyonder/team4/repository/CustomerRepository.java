package com.blueyonder.team4.repository;

import org.springframework.stereotype.Repository;

import com.blueyonder.team4.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	

}
