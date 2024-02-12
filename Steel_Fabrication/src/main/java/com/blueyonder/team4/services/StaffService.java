package com.blueyonder.team4.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.model.Staff;
import com.blueyonder.team4.repository.StaffRepository;

@Service
public class StaffService {

	@Autowired
	StaffRepository staffrepository;
	public String addstaff(Staff staff) {
		// TODO Auto-generated method stub
	   staffrepository.save(staff);
	   return "success";
	}
	public ResponseEntity<String> removestaff(int id) {
		// TODO Auto-generated method stub
		try {
		staffrepository.deleteById(id);
		return  new ResponseEntity("Succes",HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();;
		}
		return  new ResponseEntity("Failure to remove",HttpStatus.OK);
	}
//	public String updatestaff(Staff staff,int id) throws Exception {
//		// TODO Auto-generated method stub
//		
//		
//	}
	
	public Staff staffid(int id) {
		 return staffrepository.findById(id).orElse(null);
	}
}
