package com.mobile.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mobile.entity.Mobile;
import com.mobile.repo.MobileRepo;

@Repository
public class MobileDao {

@Autowired
MobileRepo mr;

	public String postdetail(Mobile m) {
		mr.save(m);
		return "Posted Successfully";
	}

	public List<Mobile> getall() {
		
		return mr.findAll();
	}

	public Mobile getById(int a) {
		
		return mr.findById(a).get();
	}


	public String update(int a,Mobile m) {
		
		mr.save(m);
		return "updated successfully";
	}

	public String deleteMob(int a) {
		mr.deleteById(a);
		return "deletede";
	}

}
