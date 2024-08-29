package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins="*")
public class MobileController {
	
	@Autowired
	MobileService  ms;
	
	@PostMapping(value="/post")
	public String postdetail(@RequestBody Mobile m) {
		
		return ms.postdetail(m);
		
	}
	
	@GetMapping(value="/getAll")
	public List<Mobile> getall(){
		return ms.getall();
	}
	
	@GetMapping(value="/getbyid/{a}")
	public Mobile getById(@PathVariable int a) {
		return ms.getById(a);
	}
	
	@PutMapping(value="/putbyid/{a}")
	public String update(@PathVariable int a,@RequestBody Mobile m) {
		return ms.update(a,m);
	}
	
	@DeleteMapping(value="/delbyid/{a}")
	public String deleteMob(@PathVariable int a) {
		return ms.deleteMob(a);
	}

}
