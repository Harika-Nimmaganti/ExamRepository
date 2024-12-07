package com.klef.jfsd.exam.service;

import java.util.List;

public interface APIService 
{
	
	//External API - JSON Placeholder
	public List<Object> fetchAllUsers();
	public Object displayUserById(int uid);
}
