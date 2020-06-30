package com.cg.PPS.bean;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author Madhura
 *
 */
@Entity
@SequenceGenerator(name="seq", initialValue=1001)
public class Job {
	
  @Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
  Integer jobId;
  
  String jobTitle;
  Double annlPkg;
  Integer noOfOpenings;
  String jobLoacation;
  String appEndDate;
  String lastQualification;
  String reqExperience;
  String spokenLang;
  Company compInfo;
  public Company getCompInfo() {
	return compInfo;
}
public void setCompInfo(Company compInfo) {
	this.compInfo = compInfo;
}
@ElementCollection
  List<String> primarySkill;
  @ElementCollection
  List<String> secondarySkill;
public Integer getJobId() {
	return jobId;
}
public void setJobId(Integer jobId) {
	this.jobId = jobId;
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public Double getAnnlPkg() {
	return annlPkg;
}
public void setAnnlPkg(Double annlPkg) {
	this.annlPkg = annlPkg;
}
public Integer getNoOfOpenings() {
	return noOfOpenings;
}
public void setNoOfOpenings(Integer noOfOpenings) {
	this.noOfOpenings = noOfOpenings;
}
public String getJobLoacation() {
	return jobLoacation;
}
public void setJobLoacation(String jobLoacation) {
	this.jobLoacation = jobLoacation;
}
public String getAppEndDate() {
	return appEndDate;
}
public void setAppEndDate(String appEndDate) {
	this.appEndDate = appEndDate;
}
public String getLastQualification() {
	return lastQualification;
}
public void setLastQualification(String lastQualification) {
	this.lastQualification = lastQualification;
}
public String getReqExperience() {
	return reqExperience;
}
public void setReqExperience(String reqExperience) {
	this.reqExperience = reqExperience;
}
public String getSpokenLang() {
	return spokenLang;
}
public void setSpokenLang(String spokenLang) {
	this.spokenLang = spokenLang;
}
public List<String> getPrimarySkill() {
	return primarySkill;
}
public void setPrimarySkill(List<String> primarySkill) {
	this.primarySkill = primarySkill;
}
public List<String> getSecondarySkill() {
	return secondarySkill;
}
public void setSecondarySkill(List<String> secondarySkill) {
	this.secondarySkill = secondarySkill;
}
@Override
public String toString() {
	return "Job [jobId=" + jobId + ", jobTitle=" + jobTitle + ", annlPkg=" + annlPkg + ", noOfOpenings=" + noOfOpenings
			+ ", jobLoacation=" + jobLoacation + ", appEndDate=" + appEndDate + ", lastQualification="
			+ lastQualification + ", reqExperience=" + reqExperience + ", spokenLang=" + spokenLang + ", compInfo="
			+ compInfo + ", primarySkill=" + primarySkill + ", secondarySkill=" + secondarySkill + "]";
}
public Job() {
	super();
	// TODO Auto-generated constructor stub
}
public Job(Integer jobId, String jobTitle, Double annlPkg, Integer noOfOpenings, String jobLoacation, String appEndDate,
		String lastQualification, String reqExperience, String spokenLang, Company compInfo, List<String> primarySkill,
		List<String> secondarySkill) {
	super();
	this.jobId = jobId;
	this.jobTitle = jobTitle;
	this.annlPkg = annlPkg;
	this.noOfOpenings = noOfOpenings;
	this.jobLoacation = jobLoacation;
	this.appEndDate = appEndDate;
	this.lastQualification = lastQualification;
	this.reqExperience = reqExperience;
	this.spokenLang = spokenLang;
	this.compInfo = compInfo;
	this.primarySkill = primarySkill;
	this.secondarySkill = secondarySkill;
}

  

  
  
  
}
