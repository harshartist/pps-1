package com.cg.PPS.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Madhura
 *
 */
@Entity
public class CVWeight {
	
	
	@Id
	Integer cvId;
	Integer jobId;
	Double percntWght;
	public Integer getCvId() {
		return cvId;
	}
	public CVWeight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCvId(Integer cvId) {
		this.cvId = cvId;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	public Double getPercntWght() {
		return percntWght;
	}
	public void setPercntWght(Double percntWght) {
		this.percntWght = percntWght;
	}
	public CVWeight(Integer cvId, Integer jobId, Double percntWght) {
		super();
		this.cvId = cvId;
		this.jobId = jobId;
		this.percntWght = percntWght;
	}
	@Override
	public String toString() {
		return "CVWeight [cvId=" + cvId + ", jobId=" + jobId + ", percntWght=" + percntWght + "]";
	}
	
	

}
