package com.study.bankprocess.model;

public class Transaction {

	private int transId;
	private String accNum;
	private String transType;
	private String trasDate;
	private String summary;

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public String getAccNum() {
		return accNum;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTrasDate() {
		return trasDate;
	}

	public void setTrasDate(String trasDate) {
		this.trasDate = trasDate;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

}
