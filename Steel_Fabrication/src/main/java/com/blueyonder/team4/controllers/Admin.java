package com.blueyonder.team4.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.team4.model.Customer;
import com.blueyonder.team4.model.Staff;
import com.blueyonder.team4.services.CustomerService;
import com.blueyonder.team4.services.StaffService;

@RestController
@RequestMapping("Admin")
public class Admin {

	@Autowired
	CustomerService customerservice;
	@GetMapping("customers")
	public List<Customer> customers(){
	    return customerservice.getallcustomers();	
	}
	
	@Autowired
	StaffService staffservice;
	@PostMapping("/addstaff")
	public String addstaff(@RequestBody Staff staff){
	    return staffservice.addstaff(staff);	
	}
	
	
	@PostMapping("removestaff/{id}")
	public ResponseEntity<String> removestaff(@PathVariable int id){
		return staffservice.removestaff(id);
	}
	
	
	@PutMapping("updatestaff/{id}")
	public String updatestaff(@RequestBody Staff staff,@PathVariable int id ) throws Exception
	{
		Staff existingstaff =staffservice.staffid(id);
		if(existingstaff != null) {
		if(staff.getFirst_name() != null)
		{
			existingstaff.setFirst_name(staff.getFirst_name());
		}
		if(staff.getLast_name() != null)
		{
			existingstaff.setLast_name(staff.getFirst_name());
		}
		if(staff.getMail() != null)
		{
			existingstaff.setMail(staff.getMail());
		}
		if(staff.getPassword() != null)
		{
			existingstaff.setPassword(staff.getPassword());
		}
		if(staff.getPhone() != null)
		{
			existingstaff.setPhone(staff.getPhone());
		}
		if(staff.getRole() != 0)
		{
			existingstaff.setRole(staff.getRole());
		}
	    staffservice.addstaff(existingstaff);
	    
		return "success";
		}
		else 
		{
			throw new Exception();
		}
		
	}
}
