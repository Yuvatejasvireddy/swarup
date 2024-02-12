package com.blueyonder.team4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.model.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Integer>{

}
