package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.service.APIService;

@RestController
@RequestMapping("api")
public class ClientController
{
	@Autowired
	private APIService userservice;
	
	@GetMapping("/")
	public String demo()
	{
		return "<h2 align='center'>API Demo</h2>";
	}
	
	@GetMapping("/users")
	public List<Object> demo1()
	{
		return userservice.fetchAllUsers();
	}
	
	@GetMapping("demo2/{id}")
	public Object demo2( @PathVariable("id") int uid)
	{
		return userservice.displayUserById(uid);
	}
	
}
