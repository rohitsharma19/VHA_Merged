package com.tcs.VHAMW.model;

import java.util.Date;

public class Agreement implements Cloneable {

	private String agreementId;
	private String agremntStartDate;
	private String agremntEndDate;
	private String agremntEffecDate;
	private String currency;
	private long agremntVersion;
	private String contractTerm;
	private String agremntStatus;

	// Product Details Summary

	private String offerName;
	private long listPrice;
	private long salePrice;
	private long quantity;
	private long totalPrice;

	private String agremntTmplateType;
	private long renewalTerm;
	private String origAgremntId;
	private String expecRevenue;
	private String internalContact;
	private String internalContactRole;
	private String custContact;
	private String custContactRole;
	private String autoRenewFlag;
	private String agremntType;
	private String agremntDocId;
	private String agremntDocName;
	private String agremntDocVer;
	private String agremntDocType;
	private String serviceReqDate;
	private Date modificationDate;
	private Date creationDate;
	private String agreementMode;

	
	
	public String getAgreementMode() {
		return agreementMode;
	}

	public void setAgreementMode(String agreementMode) {
		this.agreementMode = agreementMode;
	}

	public Agreement(String agreementId, String agremntStartDate, String agremntEndDate, String agremntEffecDate,
			String currency, long agremntVersion, String contractTerm, String agremntStatus, String offerName,
			long listPrice, long salePrice, long quantity, long totalPrice, String agremntTmplateType, long renewalTerm,
			String origAgremntId, String expecRevenue, String internalContact, String internalContactRole,
			String custContact, String custContactRole, String autoRenewFlag, String agremntType, String agremntDocId,
			String agremntDocName, String agremntDocVer, String agremntDocType, String serviceReqDate,
			Date modificationDate,Date creationDate, String agreementMode) {
		super();
		this.agreementId = agreementId;
		this.agremntStartDate = agremntStartDate;
		this.agremntEndDate = agremntEndDate;
		this.agremntEffecDate = agremntEffecDate;
		this.currency = currency;
		this.agremntVersion = agremntVersion;
		this.contractTerm = contractTerm;
		this.agremntStatus = agremntStatus;
		this.offerName = offerName;
		this.listPrice = listPrice;
		this.salePrice = salePrice;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.agremntTmplateType = agremntTmplateType;
		this.renewalTerm = renewalTerm;
		this.origAgremntId = origAgremntId;
		this.expecRevenue = expecRevenue;
		this.internalContact = internalContact;
		this.internalContactRole = internalContactRole;
		this.custContact = custContact;
		this.custContactRole = custContactRole;
		this.autoRenewFlag = autoRenewFlag;
		this.agremntType = agremntType;
		this.agremntDocId = agremntDocId;
		this.agremntDocName = agremntDocName;
		this.agremntDocVer = agremntDocVer;
		this.agremntDocType = agremntDocType;
		this.serviceReqDate = serviceReqDate;
		this.modificationDate = modificationDate;
		this.creationDate = creationDate;
		this.agreementMode = agreementMode;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getModificationDate() {
		return modificationDate;
	}

	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	


	public String getAgreementId() {
		return agreementId;
	}

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getAgremntStartDate() {
		return agremntStartDate;
	}

	public void setAgremntStartDate(String agremntStartDate) {
		this.agremntStartDate = agremntStartDate;
	}

	public String getAgremntEndDate() {
		return agremntEndDate;
	}

	public void setAgremntEndDate(String agremntEndDate) {
		this.agremntEndDate = agremntEndDate;
	}

	public String getAgremntEffecDate() {
		return agremntEffecDate;
	}

	public void setAgremntEffecDate(String agremntEffecDate) {
		this.agremntEffecDate = agremntEffecDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public long getAgremntVersion() {
		return agremntVersion;
	}

	public void setAgremntVersion(long agremntVersion) {
		this.agremntVersion = agremntVersion;
	}

	public String getContractTerm() {
		return contractTerm;
	}

	public void setContractTerm(String contractTerm) {
		this.contractTerm = contractTerm;
	}

	public String getAgremntStatus() {
		return agremntStatus;
	}

	public void setAgremntStatus(String agremntStatus) {
		this.agremntStatus = agremntStatus;
	}

	public String getOfferName() {
		return offerName;
	}

	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}

	public long getListPrice() {
		return listPrice;
	}

	public void setListPrice(long listPrice) {
		this.listPrice = listPrice;
	}

	public long getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(long salePrice) {
		this.salePrice = salePrice;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getAgremntTmplateType() {
		return agremntTmplateType;
	}

	public void setAgremntTmplateType(String agremntTmplateType) {
		this.agremntTmplateType = agremntTmplateType;
	}

	public long getRenewalTerm() {
		return renewalTerm;
	}

	public void setRenewalTerm(long renewalTerm) {
		this.renewalTerm = renewalTerm;
	}

	public String getOrigAgremntId() {
		return origAgremntId;
	}

	public void setOrigAgremntId(String origAgremntId) {
		this.origAgremntId = origAgremntId;
	}

	public String getExpecRevenue() {
		return expecRevenue;
	}

	public void setExpecRevenue(String expecRevenue) {
		this.expecRevenue = expecRevenue;
	}

	public String getInternalContact() {
		return internalContact;
	}

	public void setInternalContact(String internalContact) {
		this.internalContact = internalContact;
	}

	public String getInternalContactRole() {
		return internalContactRole;
	}

	public void setInternalContactRole(String internalContactRole) {
		this.internalContactRole = internalContactRole;
	}

	public String getCustContact() {
		return custContact;
	}

	public void setCustContact(String custContact) {
		this.custContact = custContact;
	}

	public String getCustContactRole() {
		return custContactRole;
	}

	public void setCustContactRole(String custContactRole) {
		this.custContactRole = custContactRole;
	}

	public String getAutoRenewFlag() {
		return autoRenewFlag;
	}

	public void setAutoRenewFlag(String autoRenewFlag) {
		this.autoRenewFlag = autoRenewFlag;
	}

	public String getAgremntType() {
		return agremntType;
	}

	public void setAgremntType(String agremntType) {
		this.agremntType = agremntType;
	}

	public String getAgremntDocId() {
		return agremntDocId;
	}

	public void setAgremntDocId(String agremntDocId) {
		this.agremntDocId = agremntDocId;
	}

	public String getAgremntDocName() {
		return agremntDocName;
	}

	public void setAgremntDocName(String agremntDocName) {
		this.agremntDocName = agremntDocName;
	}

	public String getAgremntDocVer() {
		return agremntDocVer;
	}

	public void setAgremntDocVer(String agremntDocVer) {
		this.agremntDocVer = agremntDocVer;
	}

	public String getAgremntDocType() {
		return agremntDocType;
	}

	public void setAgremntDocType(String agremntDocType) {
		this.agremntDocType = agremntDocType;
	}

	public String getServiceReqDate() {
		return serviceReqDate;
	}

	public void setServiceReqDate(String serviceReqDate) {
		this.serviceReqDate = serviceReqDate;
	}
	
	public boolean equals(Object obj) {
		Agreement newu = (Agreement) obj;
		if (newu.getAgreementId().equals(this.getAgreementId())&& newu.getAgremntStartDate().equals(this.getAgremntStartDate()) &&
				newu.getAgremntEndDate().equals(this.getAgremntEndDate()) &&newu.getAgremntEffecDate().equals(this.getAgremntEffecDate()) &&
				newu.getCurrency().equals(this.getCurrency()) && newu.getAgremntVersion()==(this.getAgremntVersion())&&
				newu.getContractTerm().equals(this.getContractTerm()) &&newu.getAgremntStatus().equals(this.getAgremntStatus()) &&
				newu.getOfferName().equals(this.getOfferName()) &&newu.getListPrice()==(this.getListPrice()) &&
				newu.getSalePrice()==(this.getSalePrice()) &&newu.getQuantity()==(this.getQuantity()) &&
				newu.getTotalPrice()==(this.getTotalPrice()) &&newu.getAgremntTmplateType().equals(this.getAgremntTmplateType()) &&
				newu.getRenewalTerm()==(this.getRenewalTerm()) &&newu.getOrigAgremntId().equals(this.getOrigAgremntId()) &&
				newu.getExpecRevenue().equals(this.getExpecRevenue()) &&newu.getInternalContact().equals(this.getInternalContact()) &&
				newu.getInternalContactRole().equals(this.getInternalContactRole()) &&newu.getCustContact().equals(this.getCustContact()) &&
				newu.getCustContactRole().equals(this.getCustContactRole()) &&newu.getAutoRenewFlag().equals(this.getAutoRenewFlag()) &&
				newu.getAgremntType().equals(this.getAgremntType()) &&newu.getAgremntDocId().equals(this.getAgremntDocId()) &&
				newu.getAgremntDocName().equals(this.getAgremntDocName()) &&newu.getAgremntDocVer().equals(this.getAgremntDocVer()) &&
				newu.getAgremntDocType().equals(this.getAgremntDocType()) &&newu.getServiceReqDate().equals(this.getServiceReqDate())){
		
			return true;
			
		}else{
			return false;
		}

	}
	public Agreement clone() {
		Agreement agreement = null;
		try {
			agreement = (Agreement) super.clone();
		} catch (CloneNotSupportedException e) {
			// This should never happen
		}

		return agreement;

	}
}
