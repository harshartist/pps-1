package com.cg.PPS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.PPS.bean.AdminUser;
import com.cg.PPS.service.JobService;

/**
 * @author Madhura
 *
 */
@RestController
@RequestMapping("/admin")
@CrossOrigin(allowedHeaders = "*", origins = { "http://localhost:4200" })
public class AdminController {
	 @Autowired
	JobService ser;
	
	@PostMapping("/add/{username}/{pwd}")
	public AdminUser addAdmin(@PathVariable("username") String uname, @PathVariable("pwd") String password)
	{
		
		AdminUser admin=new AdminUser();
		
		admin.setUserName(uname);admin.setPassword(password);admin.setsessionId(0);
	return	ser.addAdmin(admin);
	}
	
	
	@GetMapping("/login/{username}/{pwd}")
	public String[] adminLogin(@PathVariable("username") String uname, @PathVariable("pwd") String password) {
		
		AdminUser admin= ser.Login(uname, password);
		String arr[]=new String[2];
		arr[0]=admin.getUserName();
		arr[1]=admin.getPassword();
		return arr;
		
	}
	
	
}
