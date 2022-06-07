package com.example.demo.controller;

import java.sql.Connection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.RegisteredUserDAO;
import com.example.demo.model.Registered_User;
import com.example.demo.model.Status;

@RestController
public class AppController {
	
	
	
	
	/*@Autowired
	RegisteredUserDAO repo;*/

	@CrossOrigin
	@PostMapping("/register")
	public Status authenticate(@RequestBody Registered_User user) {
		RegisteredUserDAO obj= new RegisteredUserDAO();
		obj.connect();
		
		//List<Registered_User> ls=obj.read();
		
	/*	for(Registered_User pi:ls) {
			//System.out.println("new user"+user.toString());
			
			if(pi.equals(user)) {
				System.out.println("User already exists!");
				return Status.USER_ALREADY_EXISTS;
			}
		}
		obj.create(user);
		return Status.SUCCESS;*/
		
		boolean flag=obj.read();
		if(flag==true) {
			return Status.USER_ALREADY_EXISTS;
		}
		else {
			obj.create(user);
		return Status.SUCCESS;
		}
			
			
		}
	
	
	
	/*@CrossOrigin
	@GetMapping("/read")
	public List<Registered_User>  read() {
		RegisteredUserDAO obj= new RegisteredUserDAO();
		obj.connect();
		List<Registered_User> ls=obj.read();
		return ls;
	}*/
}
