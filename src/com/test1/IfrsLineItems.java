package com.test1;

public class IfrsLineItems {
	private Integer groupIndicator;
	private String ifrsRef;
	private boolean isApproved;
	private Integer catCode;
	private String category;
	private String accountDef;
	private Integer primaryCategory;
	private Integer secondaryCategory;
	private String lineItemCode;
	private Integer lineItemReference;
	private String scheduleDescription;
	private String status;
	private String remarks;

	public IfrsLineItems() {

	}

	public IfrsLineItems(Integer groupIndicator, String ifrsRef, boolean isApproved, Integer catCode, String category,
			String accountDef, Integer primaryCategory, Integer secondaryCategory, String lineItemCode,
			Integer lineItemReference, String scheduleDescription, String status, String remarks) {
		super();
		this.groupIndicator = groupIndicator;
		this.ifrsRef = ifrsRef;
		this.isApproved = isApproved;
		this.catCode = catCode;
		this.category = category;
		this.accountDef = accountDef;
		this.primaryCategory = primaryCategory;
		this.secondaryCategory = secondaryCategory;
		this.lineItemCode = lineItemCode;
		this.lineItemReference = lineItemReference;
		this.scheduleDescription = scheduleDescription;
		this.status = status;
		this.remarks = remarks;
	}

	public Integer getGroupIndicator() {
		return groupIndicator;
	}

	public void setGroupIndicator(Integer groupIndicator) {
		this.groupIndicator = groupIndicator;
	}

	public String getIfrsRef() {
		return ifrsRef;
	}

	public void setIfrsRef(String ifrsRef) {
		this.ifrsRef = ifrsRef;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public Integer getCatCode() {
		return catCode;
	}

	public void setCatCode(Integer catCode) {
		this.catCode = catCode;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAccountDef() {
		return accountDef;
	}

	public void setAccountDef(String accountDef) {
		this.accountDef = accountDef;
	}

	public Integer getPrimaryCategory() {
		return primaryCategory;
	}

	public void setPrimaryCategory(Integer primaryCategory) {
		this.primaryCategory = primaryCategory;
	}

	public Integer getSecondaryCategory() {
		return secondaryCategory;
	}

	public void setSecondaryCategory(Integer secondaryCategory) {
		this.secondaryCategory = secondaryCategory;
	}

	public String getLineItemCode() {
		return lineItemCode;
	}

	public void setLineItemCode(String lineItemCode) {
		this.lineItemCode = lineItemCode;
	}

	public Integer getLineItemReference() {
		return lineItemReference;
	}

	public void setLineItemReference(Integer lineItemReference) {
		this.lineItemReference = lineItemReference;
	}

	public String getScheduleDescription() {
		return scheduleDescription;
	}

	public void setScheduleDescription(String scheduleDescription) {
		this.scheduleDescription = scheduleDescription;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
