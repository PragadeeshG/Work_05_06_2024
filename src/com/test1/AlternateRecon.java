package com.test1;

public class AlternateRecon {
	private String ledgerData;
	private String accountPurpose;
	private String realm;
	private String reconSystem;
	private String reconSystemCode;
	private String reconSystemDescription;
	private String swiftCode;
	private Integer interdaySwiftCode;
	private String accountStatus;
	private String nostrolIdentifier;
	private String entityState;

	public AlternateRecon() {

	}

	public AlternateRecon(String ledgerData, String accountPurpose, String realm, String reconSystem,
			String reconSystemCode, String reconSystemDescription, String swiftCode, Integer interdaySwiftCode,
			String accountStatus, String nostrolIdentifier, String entityState) {
		super();
		this.ledgerData = ledgerData;
		this.accountPurpose = accountPurpose;
		this.realm = realm;
		this.reconSystem = reconSystem;
		this.reconSystemCode = reconSystemCode;
		this.reconSystemDescription = reconSystemDescription;
		this.swiftCode = swiftCode;
		this.interdaySwiftCode = interdaySwiftCode;
		this.accountStatus = accountStatus;
		this.nostrolIdentifier = nostrolIdentifier;
		this.entityState = entityState;
	}

	public String getLedgerData() {
		return ledgerData;
	}

	public void setLedgerData(String ledgerData) {
		this.ledgerData = ledgerData;
	}

	public String getAccountPurpose() {
		return accountPurpose;
	}

	public void setAccountPurpose(String accountPurpose) {
		this.accountPurpose = accountPurpose;
	}

	public String getRealm() {
		return realm;
	}

	public void setRealm(String realm) {
		this.realm = realm;
	}

	public String getReconSystem() {
		return reconSystem;
	}

	public void setReconSystem(String reconSystem) {
		this.reconSystem = reconSystem;
	}

	public String getReconSystemCode() {
		return reconSystemCode;
	}

	public void setReconSystemCode(String reconSystemCode) {
		this.reconSystemCode = reconSystemCode;
	}

	public String getReconSystemDescription() {
		return reconSystemDescription;
	}

	public void setReconSystemDescription(String reconSystemDescription) {
		this.reconSystemDescription = reconSystemDescription;
	}

	public String getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(String swiftCode) {
		this.swiftCode = swiftCode;
	}

	public Integer getInterdaySwiftCode() {
		return interdaySwiftCode;
	}

	public void setInterdaySwiftCode(Integer interdaySwiftCode) {
		this.interdaySwiftCode = interdaySwiftCode;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getNostrolIdentifier() {
		return nostrolIdentifier;
	}

	public void setNostrolIdentifier(String nostrolIdentifier) {
		this.nostrolIdentifier = nostrolIdentifier;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
