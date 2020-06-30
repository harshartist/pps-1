package com.cg.PPS.service;

import java.util.List;

import com.cg.PPS.bean.AdminUser;
import com.cg.PPS.bean.Job;

/**
 * @author Madhura
 *
 */
public interface JobService {
	
	public Job postJob(Job job);
	public Job getJob(Integer jobId);
	public List<Job> findAllJob();
	public List<Integer> getIds();
	public AdminUser addAdmin(AdminUser admin);
	public AdminUser Login(String username,String pwd);
	public List<Job> getanajobs();
	
	

}
