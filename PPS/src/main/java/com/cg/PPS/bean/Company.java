package com.cg.PPS.bean;

import javax.persistence.Embeddable;

/**
 * @author Madhura
 *
 */
@Embeddable
public class Company {

	String companyName;
	String hrName;
	String phNo;
	String emlId;
	
	public Company(String companyName, String hrName, String phNo, String emlId) {
		super();
		this.companyName = companyName;
		this.hrName = hrName;
		this.phNo = phNo;
		this.emlId = emlId;
		
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getHrName() {
		return hrName;
	}
	public void setHrName(String hrName) {
		this.hrName = hrName;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public String getEmlId() {
		return emlId;
	}
	public void setEmlId(String emlId) {
		this.emlId = emlId;
	}
	
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", hrName=" + hrName + ", phNo=" + phNo + ", emlId=" + emlId
				+ ", jobAddress=" + "]";
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
