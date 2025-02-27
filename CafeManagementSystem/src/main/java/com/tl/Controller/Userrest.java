package com.tl.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tl.wrapper.UserWrapper;

@RequestMapping(path="/user")
public interface Userrest {
	
	@PostMapping(path="/signup")
	public ResponseEntity<String>signup(@RequestBody(required=true)Map<String,String>requestmap);
	
	@PostMapping(path="/login")
	public ResponseEntity<String>login(@RequestBody(required=true)Map<String,String>requestmap);
	
	@GetMapping(path="/get")
	public ResponseEntity<List<UserWrapper>>getalluser();
	
	@PostMapping(path="/update")
	public ResponseEntity<String>update(@RequestBody(required=true)Map<String,String>requestmap);
	
	@GetMapping(path="checktoken")
	public ResponseEntity<String>checktoken();
	
	@PostMapping(path="changepassword")
	public ResponseEntity<String>changepassword(@RequestBody(required=true)Map<String,String>requestmap);
	
	@PostMapping(path="forgotpassword")
	public ResponseEntity<String>forgotpassword(@RequestBody()Map<String,String>requestmap);
}
