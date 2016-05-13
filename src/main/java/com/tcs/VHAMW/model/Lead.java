package com.tcs.VHAMW.model;

import java.util.Date;

public class Lead implements Cloneable {

	// Capture Initial Details

	private long abn;
	private String accName;
	private long acn;
	private String compName;
	private String custType;
	private long pin;
	private String tradingAs;

	// Contact Details

	private String title;
	private String firstName;
	private String lastName;
	private long contactNum;
	private Date dob;
	private String eMail;
	private String contactRole;
	private String prefModOfCom;

	// Know your Customer - Segmentation/Organization

	private String industryType;
	private String businessStage;

	// Know your customer - Additional Details

	private String assignToGrp;
	private String assignToUser;
	private String createdByUser;
	private String createdByGroup;
	private String status;

	// Lead Summary

	private String leadId;
	private Date creationDate;
	private String version;
	private Date modificationDate;
	
	private String leadMode;

	// Constructor

	
	public Lead() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Lead(long abn, String accName, long acn, String compName, String custType, long pin, String tradingAs,
			String title, String firstName, String lastName, long contactNum, Date dob, String eMail,
			String contactRole, String prefModOfCom, String industryType, String businessStage, String assignToGrp,
			String assignToUser, String createdByUser, String createdByGroup, String status, String leadId,
			Date creationDate, String version, Date modificationDate, String leadMode) {
		this.abn = abn;
		this.accName = accName;
		this.acn = acn;
		this.compName = compName;
		this.custType = custType;
		this.pin = pin;
		this.tradingAs = tradingAs;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNum = contactNum;
		this.dob = dob;
		this.eMail = eMail;
		this.contactRole = contactRole;
		this.prefModOfCom = prefModOfCom;
		this.industryType = industryType;
		this.businessStage = businessStage;
		this.assignToGrp = assignToGrp;
		this.assignToUser = assignToUser;
		this.createdByUser = createdByUser;
		this.createdByGroup = createdByGroup;
		this.status = status;
		this.leadId = leadId;
		this.creationDate = creationDate;
		this.version = version;
		this.modificationDate = modificationDate;
		this.leadMode = leadMode;
	}

	public String getLeadMode() {
		return leadMode;
	}

	public void setLeadMode(String leadMode) {
		this.leadMode = leadMode;
	}
	
	public long getAbn() {
		return abn;
	}

	public void setAbn(long abn) {
		this.abn = abn;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public long getAcn() {
		return acn;
	}

	public void setAcn(long acn) {
		this.acn = acn;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCustType() {
		return custType;
	}

	public void setCustType(String custType) {
		this.custType = custType;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getTradingAs() {
		return tradingAs;
	}

	public void setTradingAs(String tradingAs) {
		this.tradingAs = tradingAs;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContactNum() {
		return contactNum;
	}

	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getContactRole() {
		return contactRole;
	}

	public void setContactRole(String contactRole) {
		this.contactRole = contactRole;
	}

	public String getPrefModOfCom() {
		return prefModOfCom;
	}

	public void setPrefModOfCom(String prefModOfCom) {
		this.prefModOfCom = prefModOfCom;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getBusinessStage() {
		return businessStage;
	}

	public void setBusinessStage(String businessStage) {
		this.businessStage = businessStage;
	}

	public String getAssignToGrp() {
		return assignToGrp;
	}

	public void setAssignToGrp(String assignToGrp) {
		this.assignToGrp = assignToGrp;
	}

	public String getAssignToUser() {
		return assignToUser;
	}

	public void setAssignToUser(String assignToUser) {
		this.assignToUser = assignToUser;
	}

	public String getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}

	public String getCreatedByGroup() {
		return createdByGroup;
	}

	public void setCreatedByGroup(String createdByGroup) {
		this.createdByGroup = createdByGroup;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLeadId() {
		return leadId;
	}

	public void setLeadId(String leadId) {
		this.leadId = leadId;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}

	public Lead clone() {
		Lead lead = null;
		try {
			lead = (Lead) super.clone();
		} catch (CloneNotSupportedException e) {
			// This should never happen
		}

		return lead;

	}

	public boolean equals(Object obj) {
		Lead newu = (Lead) obj;

			 if (newu.getAbn()==(this.getAbn())&&newu.getAccName().equals(this.getAccName())&&
			 newu.getAcn()==(this.getAcn())&&newu.getCompName().equals(this.getCompName())&&
			 newu.getCustType().equals(this.getCustType())&&newu.getPin()==(this.getPin())&&
			 newu.getTradingAs().equals(this.getTradingAs())&&newu.getTitle().equals(this.getTitle())&&
			 newu.getFirstName().equals(this.getFirstName())&&newu.getLastName().equals(this.getLastName())&&
			 newu.getContactNum()==(this.getContactNum())&&newu.getDob().equals(this.getDob())&&
			 newu.geteMail().equals(this.geteMail())&&newu.getContactRole().equals(this.getContactRole())&&
			 newu.getPrefModOfCom().equals(this.getPrefModOfCom())&&newu.getIndustryType().equals(this.getIndustryType())&&
			 newu.getBusinessStage().equals(this.getBusinessStage())&&newu.getAssignToGrp().equals(this.getAssignToGrp())&&
			 newu.getAssignToUser().equals(this.getAssignToUser())&&newu.getCreatedByUser().equals(this.getCreatedByUser())&&
			 newu.getCreatedByGroup().equals(this.getCreatedByGroup())&&newu.getStatus().equals(this.getStatus())&&
			 newu.getLeadId().equals(this.getLeadId()) && newu.getCreationDate().equals(this.getCreationDate())&&newu.getVersion().equals(this.getVersion())&&
			 newu.getModificationDate().equals(this.getModificationDate()))
			 
			 return true;
		else
			return false;
	}
}
