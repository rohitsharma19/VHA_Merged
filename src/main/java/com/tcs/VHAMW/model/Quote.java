package com.tcs.VHAMW.model;

import java.util.Date;

public class Quote implements Cloneable {
	
	private Date modificationDate;
	
	private	String quoteId	;
	private Date creationDate;
	private	String name	;
	private int   quoteVersion;
	private String stage;
	private String currency;	
	private String territoryCode;
	private String value;
	private String discountedPrice;
	private	String quoteCreatedBy;
	private String assignedGroup;
	private String assignedUser;
	private int quoteLineId;
	private String quoteLineVrsn;
	private String listPrice;
	private int originalPrice;
	private int revisedPrice;
	private int approvedPrice;
	private int discount;
	private String discountPrcnt;
	private String approver;
	private String approvedStatus;
	private String nextlevel ;
	private String quantity;
	private String quoteMode;

	public String getQuoteMode() {
		return quoteMode;
	}
	public void setQuoteMode(String quoteMode) {
		this.quoteMode = quoteMode;
	}
	public Quote (){}
	public Quote(Date modificationDate, String quoteId, Date creationDate, String name, int quoteVersion, String stage,
			String currency, String territoryCode, String value, String discountedPrice, String quoteCreatedBy,
			String assignedGroup, String assignedUser, int quoteLineId, String quoteLineVrsn, String listPrice,
			int originalPrice, int revisedPrice, int approvedPrice, int discount, String discountPrcnt, String approver,
			String approvedStatus, String nextlevel, String quantity, String quoteMode) {
		
		this.modificationDate = modificationDate;
		this.quoteId = quoteId;
		this.creationDate = creationDate;
		this.name = name;
		this.quoteVersion = quoteVersion;
		this.stage = stage;
		this.currency = currency;
		this.territoryCode = territoryCode;
		this.value = value;
		this.discountedPrice = discountedPrice;
		this.quoteCreatedBy = quoteCreatedBy;
		this.assignedGroup = assignedGroup;
		this.assignedUser = assignedUser;
		this.quoteLineId = quoteLineId;
		this.quoteLineVrsn = quoteLineVrsn;
		this.listPrice = listPrice;
		this.originalPrice = originalPrice;
		this.revisedPrice = revisedPrice;
		this.approvedPrice = approvedPrice;
		this.discount = discount;
		this.discountPrcnt = discountPrcnt;
		this.approver = approver;
		this.approvedStatus = approvedStatus;
		this.nextlevel = nextlevel;
		this.quantity = quantity;
		this.quoteMode = quoteMode;
	}
	public Date getModificationDate() {
		return modificationDate;
	}
	public void setModificationDate(Date modificationDate) {
		this.modificationDate = modificationDate;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuoteVersion() {
		return quoteVersion;
	}
	public void setQuoteVersion(int quoteVersion) {
		this.quoteVersion = quoteVersion;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getTerritoryCode() {
		return territoryCode;
	}
	public void setTerritoryCode(String territoryCode) {
		this.territoryCode = territoryCode;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(String discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public String getQuoteCreatedBy() {
		return quoteCreatedBy;
	}
	public void setQuoteCreatedBy(String quoteCreatedBy) {
		this.quoteCreatedBy = quoteCreatedBy;
	}
	public String getAssignedGroup() {
		return assignedGroup;
	}
	public void setAssignedGroup(String assignedGroup) {
		this.assignedGroup = assignedGroup;
	}
	public String getAssignedUser() {
		return assignedUser;
	}
	public void setAssignedUser(String assignedUser) {
		this.assignedUser = assignedUser;
	}
	public int getQuoteLineId() {
		return quoteLineId;
	}
	public void setQuoteLineId(int quoteLineId) {
		this.quoteLineId = quoteLineId;
	}
	public String getQuoteLineVrsn() {
		return quoteLineVrsn;
	}
	public void setQuoteLineVrsn(String quoteLineVrsn) {
		this.quoteLineVrsn = quoteLineVrsn;
	}
	public String getListPrice() {
		return listPrice;
	}
	public void setListPrice(String listPrice) {
		this.listPrice = listPrice;
	}
	public int getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(int originalPrice) {
		this.originalPrice = originalPrice;
	}
	public int getRevisedPrice() {
		return revisedPrice;
	}
	public void setRevisedPrice(int revisedPrice) {
		this.revisedPrice = revisedPrice;
	}
	public int getApprovedPrice() {
		return approvedPrice;
	}
	public void setApprovedPrice(int approvedPrice) {
		this.approvedPrice = approvedPrice;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getDiscountPrcnt() {
		return discountPrcnt;
	}
	public void setDiscountPrcnt(String discountPrcnt) {
		this.discountPrcnt = discountPrcnt;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
	public String getApprovedStatus() {
		return approvedStatus;
	}
	public void setApprovedStatus(String approvedStatus) {
		this.approvedStatus = approvedStatus;
	}
	public String getNextlevel() {
		return nextlevel;
	}
	public void setNextlevel(String nextlevel) {
		this.nextlevel = nextlevel;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	public boolean equals(Object obj) {
		Quote newu = (Quote) obj;
		
		if (newu.getModificationDate().equals(this.getModificationDate()) &&newu.getQuoteId().equals(this.getQuoteId())&&
			newu.getCreationDate().equals(this.getCreationDate())&& newu.getName().equals(this.getName())&&
			newu.getQuoteVersion()==(this.getQuoteVersion())&&
			newu.getStage().equals(this.getStage())&&newu.getCurrency().equals(this.getCurrency())&& 
			newu.getTerritoryCode().equals(this.getTerritoryCode())&&newu.getValue().equals(this.getValue())&&
			newu.getDiscountedPrice().equals(this.getDiscountedPrice())&&newu.getQuoteCreatedBy().equals(this.getQuoteCreatedBy())&&
			newu.getAssignedGroup().equals(this.getAssignedGroup())&&newu.getAssignedUser().equals(this.getAssignedUser())&&
			newu.getQuoteLineId()==(this.getQuoteLineId())&&newu.getQuoteLineVrsn().equals(this.getQuoteLineVrsn())&&
			newu.getListPrice().equals(this.getListPrice())&&newu.getOriginalPrice()==(this.getOriginalPrice())&&
			newu.getRevisedPrice()==(this.getRevisedPrice())&&newu.getApprovedPrice()==(this.getApprovedPrice())&&
			newu.getDiscount()==(this.getDiscount())&&newu.getDiscountPrcnt().equals(this.getDiscountPrcnt())&&
			newu.getApprover().equals(this.getApprover())&&newu.getApprovedStatus().equals(this.getApprovedStatus())&&
			newu.getNextlevel().equals(this.getNextlevel())&&newu.getQuantity().equals(this.getQuantity()))
			
			return true;
		else
			return false;

	}
	
	public Quote clone() {
		Quote quote = null;
		try {
			quote = (Quote) super.clone();
		} catch (CloneNotSupportedException e) {
			// This should never happen
		}

		return quote;

	}

}