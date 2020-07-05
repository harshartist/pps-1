package com.cg.PPS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.PPS.bean.AdminUser;
import com.cg.PPS.bean.Job;
import com.cg.PPS.dao.AdminDao;
import com.cg.PPS.dao.JobDao;

import javassist.bytecode.analysis.Analyzer;

/**
 * @author Madhura
 *
 */
@Service
public class JobServiceImpl implements JobService {

	@Autowired
	JobDao jobDao;

	@Override
	public Job postJob(Job job) {
		return jobDao.save(job);
	}

	@Override
	public Job getJob(Integer jobId) {
		return jobDao.findById(jobId).get();
		
	}

	@Override
	public List<Job> findAllJob() {
		return jobDao.findAll();
	}

	@Override
	public List<Integer> getIds() {
		List<Integer> jobIds=new ArrayList<Integer>();
		List<Job> jobs=jobDao.findAll();
		for (Job job : jobs) {
			jobIds.add(job.getJobId());
		}
		return jobIds;
	}
	
	
	@Autowired
	AdminDao admindao;

	@Override
	public AdminUser addAdmin(AdminUser admin) {
		
		return admindao.save(admin);
	}

	@Override
	public AdminUser Login(String username, String pwd) {
		Boolean flag=false;
		
		AdminUser loggedadmin=new AdminUser();
		List<AdminUser> lst=admindao.findAll();
		for (AdminUser admin : lst) {
			if(admin.getUserName().equals(username) && admin.getPassword().equals(pwd)) {
				loggedadmin=admin;
				System.out.println(loggedadmin);
				flag=true;
				admindao.save(loggedadmin);
				break;
			}
		}
		return loggedadmin ;
	}

	@Override
	public List<Job> getanajobs() {
		RestTemplate rest=new RestTemplate();
		
		List<Job> anajobs=new ArrayList<Job>();
		List<Job> jobs=jobDao.findAll();
		for (Job job : jobs) {
			
		}
		
		return null;
	}
	
	
	

}
