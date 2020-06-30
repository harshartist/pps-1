package com.cg.PPS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.PPS.bean.Job;
import com.cg.PPS.service.JobService;

/**
 * @author Madhura
 *
 */
@RestController
@RequestMapping("/job")
@CrossOrigin(allowedHeaders = "*", origins = { "http://localhost:4200" })
public class JobController {
	
	@Autowired
	JobService jobService;
	
	@GetMapping("/test")
	public String test() {
		return "Hello World";
	}
	
	@PostMapping("/postnewJob")
	public Job postJob(@RequestBody Job job) {
		
		return jobService.postJob(job);
	}
	
	@GetMapping("/getjob/{jobId}")
	public Job getJob(@PathVariable("jobId") Integer jobId) {
		System.out.println(jobService.getJob(jobId));
		return jobService.getJob(jobId);
	}
	
	@GetMapping("/getAll")
	public List<Job> getAllJobs() {
		
		return jobService.findAllJob();
	}
	
	@GetMapping("/getAllJob/ids")
	public List<Integer> getAllJobIds(){
		return jobService.getIds();
		
	}
	
	
}
