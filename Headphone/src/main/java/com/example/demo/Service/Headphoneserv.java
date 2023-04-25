package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.*;
import com.example.demo.Repository.headphonerepo;

@Service
public class Headphoneserv {
	@Autowired
	public headphonerepo r;
	
	public List<HP_Model> getdata(){
		return r.findAll();
	}
	public HP_Model postdata(HP_Model l) {
		return r.save(l);
	}
	public HP_Model updatebyid(HP_Model n)
	{
		return r.saveAndFlush(n);
		//return "The Data Updated for the given ID";
	}
	public String deletebyid(int id)
	{
		r.deleteById(id);
		return"The Data deleted for the given ID";
	}
}
