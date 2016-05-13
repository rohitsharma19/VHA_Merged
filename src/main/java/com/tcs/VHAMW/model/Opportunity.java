package com.tcs.VHAMW.model;

import java.util.Date;

public class Opportunity implements Cloneable {
	
	//Know your Customer - Preference
	
private String opportunityName;
private String opportunitySource;
private String opportunityType;
private String opportunitySize;
private String purchaseTimeFrame;
private String probability;
private String competitor;
private Date requestedDate;
private Date closedDate;
private String closureReason;
private String territoryCodeOrRegion;
private String stage;
private String opportunityId;
private String autoAssignFlag;
private String opportunityRisksFlag;
private String opportunityPotentialFlag;
private String solutionOptionsFlag;
private String communicationPreference;
private String assignedToGroup;
private String assignedToUser;
private String createdByUser;
private String createdByGroup;
private Date opportunityCreationDate;
private Date opportunityLastUpdateDate;
private String OpportunityVersion;

//Contacts

private String title;
private String firstName;
private String lastName;
private long contactNumber;
private Date dateOfBirth;
private String emailAddress;
private String contactRole;
private String preferredModeOfCommmunication;
private String leadId;

private String opportunityMode;





public String getOpportunityMode() {
	return opportunityMode;
}




public void setOpportunityMode(String opportunityMode) {
	this.opportunityMode = opportunityMode;
}




public Opportunity() {
	super();
	// TODO Auto-generated constructor stub
}




public Opportunity(String opportunityName, String opportunitySource, String opportunityType, String opportunitySize,
		String purchaseTimeFrame, String probability, String competitor, Date requestedDate, Date closedDate,
		String closureReason, String territoryCodeOrRegion, String stage, String opportunityId, String autoAssignFlag,
		String opportunityRisksFlag, String opportunityPotentialFlag, String solutionOptionsFlag,
		String communicationPreference, String assignedToGroup, String assignedToUser, String createdByUser,
		String createdByGroup, String title, String firstName, String lastName, long contactNumber, Date dateOfBirth,
		String emailAddress, String contactRole, String preferredModeOfCommmunication, Date opportunityCreationDate,
		Date opportunityLastUpdateDate, String opportunityVersion, String leadId, String opportunityMode) {
	super();
	this.opportunityName = opportunityName;
	this.opportunitySource = opportunitySource;
	this.opportunityType = opportunityType;
	this.opportunitySize = opportunitySize;
	this.purchaseTimeFrame = purchaseTimeFrame;
	this.probability = probability;
	this.competitor = competitor;
	this.requestedDate = requestedDate;
	this.closedDate = closedDate;
	this.closureReason = closureReason;
	this.territoryCodeOrRegion = territoryCodeOrRegion;
	this.stage = stage;
	this.opportunityId = opportunityId;
	this.autoAssignFlag = autoAssignFlag;
	this.opportunityRisksFlag = opportunityRisksFlag;
	this.opportunityPotentialFlag = opportunityPotentialFlag;
	this.solutionOptionsFlag = solutionOptionsFlag;
	this.communicationPreference = communicationPreference;
	this.assignedToGroup = assignedToGroup;
	this.assignedToUser = assignedToUser;
	this.createdByUser = createdByUser;
	this.createdByGroup = createdByGroup;
	this.title = title;
	this.firstName = firstName;
	this.lastName = lastName;
	this.contactNumber = contactNumber;
	this.dateOfBirth = dateOfBirth;
	this.emailAddress = emailAddress;
	this.contactRole = contactRole;
	this.preferredModeOfCommmunication = preferredModeOfCommmunication;
	this.opportunityCreationDate = opportunityCreationDate;
	this.opportunityLastUpdateDate = opportunityLastUpdateDate;
	OpportunityVersion = opportunityVersion;
	this.leadId = leadId;
	this.opportunityMode = opportunityMode;
}
public String getOpportunityName() {
	return opportunityName;
}
public void setOpportunityName(String opportunityName) {
	this.opportunityName = opportunityName;
}
public String getOpportunitySource() {
	return opportunitySource;
}
public void setOpportunitySource(String opportunitySource) {
	this.opportunitySource = opportunitySource;
}
public String getOpportunityType() {
	return opportunityType;
}
public void setOpportunityType(String opportunityType) {
	this.opportunityType = opportunityType;
}
public String getOpportunitySize() {
	return opportunitySize;
}
public void setOpportunitySize(String opportunitySize) {
	this.opportunitySize = opportunitySize;
}
public String getPurchaseTimeFrame() {
	return purchaseTimeFrame;
}
public void setPurchaseTimeFrame(String purchaseTimeFrame) {
	this.purchaseTimeFrame = purchaseTimeFrame;
}
public String getProbability() {
	return probability;
}
public void setProbability(String probability) {
	this.probability = probability;
}
public String getCompetitor() {
	return competitor;
}
public void setCompetitor(String competitor) {
	this.competitor = competitor;
}
public Date getRequestedDate() {
	return requestedDate;
}
public void setRequestedDate(Date requestedDate) {
	this.requestedDate = requestedDate;
}
public Date getClosedDate() {
	return closedDate;
}
public void setClosedDate(Date closedDate) {
	this.closedDate = closedDate;
}
public String getClosureReason() {
	return closureReason;
}
public void setClosureReason(String closureReason) {
	this.closureReason = closureReason;
}
public String getTerritoryCodeOrRegion() {
	return territoryCodeOrRegion;
}
public void setTerritoryCodeOrRegion(String territoryCodeOrRegion) {
	this.territoryCodeOrRegion = territoryCodeOrRegion;
}
public String getStage() {
	return stage;
}
public void setStage(String stage) {
	this.stage = stage;
}
public String getOpportunityId() {
	return opportunityId;
}
public void setOpportunityId(String opportunityId) {
	this.opportunityId = opportunityId;
}
public String getAutoAssignFlag() {
	return autoAssignFlag;
}
public void setAutoAssignFlag(String autoAssignFlag) {
	this.autoAssignFlag = autoAssignFlag;
}
public String getOpportunityRisksFlag() {
	return opportunityRisksFlag;
}
public void setOpportunityRisksFlag(String opportunityRisksFlag) {
	this.opportunityRisksFlag = opportunityRisksFlag;
}
public String getOpportunityPotentialFlag() {
	return opportunityPotentialFlag;
}
public void setOpportunityPotentialFlag(String opportunityPotentialFlag) {
	this.opportunityPotentialFlag = opportunityPotentialFlag;
}
public String getSolutionOptionsFlag() {
	return solutionOptionsFlag;
}
public void setSolutionOptionsFlag(String solutionOptionsFlag) {
	this.solutionOptionsFlag = solutionOptionsFlag;
}
public String getCommunicationPreference() {
	return communicationPreference;
}
public void setCommunicationPreference(String communicationPreference) {
	this.communicationPreference = communicationPreference;
}
public String getAssignedToGroup() {
	return assignedToGroup;
}
public void setAssignedToGroup(String assignedToGroup) {
	this.assignedToGroup = assignedToGroup;
}
public String getAssignedToUser() {
	return assignedToUser;
}
public void setAssignedToUser(String assignedToUser) {
	this.assignedToUser = assignedToUser;
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
public long getContactNumber() {
	return contactNumber;
}
public void setContactNumber(long contactNumber) {
	this.contactNumber = contactNumber;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}
public String getContactRole() {
	return contactRole;
}
public void setContactRole(String contactRole) {
	this.contactRole = contactRole;
}
public String getPreferredModeOfCommmunication() {
	return preferredModeOfCommmunication;
}
public void setPreferredModeOfCommmunication(String preferredModeOfCommmunication) {
	this.preferredModeOfCommmunication = preferredModeOfCommmunication;
}
public Date getOpportunityCreationDate() {
	return opportunityCreationDate;
}
public void setOpportunityCreationDate(Date opportunityCreationDate) {
	this.opportunityCreationDate = opportunityCreationDate;
}
public Date getOpportunityLastUpdateDate() {
	return opportunityLastUpdateDate;
}
public void setOpportunityLastUpdateDate(Date opportunityLastUpdateDate) {
	this.opportunityLastUpdateDate = opportunityLastUpdateDate;
}
public String getOpportunityVersion() {
	return OpportunityVersion;
}
public void setOpportunityVersion(String opportunityVersion) {
	OpportunityVersion = opportunityVersion;
}
public String getLeadId() {
	return leadId;
}
public void setLeadId(String leadId) {
	this.leadId = leadId;
}
public boolean equals(Object obj) {
	Opportunity newu = (Opportunity) obj;
	
	if (newu.getOpportunityName().equals(this.getOpportunityName())&&newu.getOpportunitySource().equals(this.getOpportunitySource())&&
	 newu.getOpportunityType().equals(this.getOpportunityType())&&newu.getOpportunitySize().equals(this.getOpportunitySize())&&
	 newu.getPurchaseTimeFrame().equals(this.getPurchaseTimeFrame())&&newu.getProbability().equals(this.getProbability())&&
	 newu.getCompetitor().equals(this.getCompetitor())&&newu.getRequestedDate().equals(this.getRequestedDate())&&
	 newu.getClosedDate().equals(this.getClosedDate())&&newu.getClosureReason().equals(this.getClosureReason())&&
	 newu.getTerritoryCodeOrRegion().equals(this.getTerritoryCodeOrRegion())&&newu.getStage().equals(this.getStage())&&
	 newu.getOpportunityId().equals(this.getOpportunityId())&&newu.getAutoAssignFlag().equals(this.getAutoAssignFlag())&&
	 newu.getOpportunityRisksFlag().equals(this.getOpportunityRisksFlag())&&newu.getOpportunityPotentialFlag().equals(this.getOpportunityPotentialFlag())&&
	 newu.getCommunicationPreference().equals(this.getCommunicationPreference())&&newu.getAssignedToGroup().equals(this.getAssignedToGroup())&&
	 newu.getAssignedToUser().equals(this.getAssignedToUser())&&newu.getCreatedByUser().equals(this.getCreatedByUser())&&								
	 newu.getCreatedByGroup().equals(this.getCreatedByGroup())&&newu.getTitle().equals(this.getTitle())&&
	 newu.getFirstName().equals(this.getFirstName())&&newu.getLastName().equals(this.getLastName())&&
	 newu.getContactNumber()==(this.getContactNumber())&&newu.getDateOfBirth().equals(this.getDateOfBirth())&&
	 newu.getEmailAddress().equals(this.getEmailAddress())&&newu.getContactRole().equals(this.getContactRole())&&
	 newu.getPreferredModeOfCommmunication().equals(this.getPreferredModeOfCommmunication())&&newu.getOpportunityCreationDate().equals(this.getOpportunityCreationDate())&&
	 newu.getOpportunityLastUpdateDate().equals(this.getOpportunityLastUpdateDate())&&newu.getOpportunityVersion()==(this.getOpportunityVersion())&&
	 newu.getLeadId().equals(this.getLeadId()))
	 
		return true;
	else
		return false;

}

public Opportunity clone() {
	Opportunity opportunity = null;
	try {
		opportunity = (Opportunity) super.clone();
	} catch (CloneNotSupportedException e) {
		// This should never happen
	}

	return opportunity;

}
}
