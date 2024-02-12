package com.blueyonder.team4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.blueyonder.team4.model.Customer;
import com.blueyonder.team4.model.Staff;
import com.blueyonder.team4.repository.CustomerRepository;
import com.blueyonder.team4.repository.StaffRepository;


@Service
public class CustomerService {

	@Autowired 
	CustomerRepository customerrepository;
	 
	public List<Customer> getallcustomers() {
		// TODO Auto-generated method stub
		List<Customer> c=customerrepository.findAll();
		return c;
	}
	
	


}
