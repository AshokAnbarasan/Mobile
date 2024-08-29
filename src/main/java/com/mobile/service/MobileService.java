package com.mobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;


@Service
public class MobileService {
	
	@Autowired
	MobileDao md;

	public String postdetail(Mobile m) {
		
		m.setNetprice(m.getPrice()-(m.getPrice()*m.getDiscountper()/100));
	
		return md.postdetail(m);
	}

	public List<Mobile> getall() {
		
		return md.getall();
	}

	public Mobile getById(int a) {
		
		return md.getById(a);
	}

	public String update(int a, Mobile m) {
		Mobile mb=md.getById(a);
		mb.setBrand(m.getBrand());
		mb.setPrice(m.getPrice());
		mb.setDiscountper(m.getDiscountper());
		return md.update(a,m);
	}

	public String deleteMob(int a) {
		
		return md.deleteMob(a);
	}

}
