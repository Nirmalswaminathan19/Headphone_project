package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.HP_Model;
import com.example.demo.Service.Headphoneserv;

@RestController
public class headphonecontroller {
	@Autowired
	Headphoneserv t;
	@GetMapping("/getdetails")
	public List<HP_Model> getdetails(){
		return t.getdata();
	}
	@PostMapping("/postdetails")
	public HP_Model postdata(@RequestBody HP_Model n) {
		return t.postdata(n);
	}
	@PutMapping("/putdetails")
	public HP_Model putdata(@RequestBody HP_Model i)
	{
		return t.updatebyid(i);
	}
	@DeleteMapping("/deletedata/{id}")
	public String deletedata(@PathVariable int id)
	{
		return t.deletebyid(id);
	}
	@DeleteMapping("/deletedata")
	public String deletedatabyid(@RequestParam int id)
	{
		return t.deletebyid(id);
	}
}
