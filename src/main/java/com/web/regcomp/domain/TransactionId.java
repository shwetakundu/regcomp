package com.web.regcomp.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

@SuppressWarnings("serial")
public class TransactionId implements Serializable {
	
	@Column(name="ACCOUNT_NUM")
    private Long accountNum;
	@Column(name="VALUE_DATE")
	private Date valueDate;
	@Column(name="CURRENCY")
	private String currency;
	@Column(name="AMOUNT")
	private Double amount;
	@Column(name="TRANSACTION_TYPE")
	private String transactionType;
	
	public TransactionId(){
		
	}

    public TransactionId(Long accountNum, Date valueDate, String currency, Double amount, String transactionType) {
        this.accountNum = accountNum;
        this.valueDate = valueDate;
        this.currency = currency;
        this.amount = amount;
        this.transactionType = transactionType;
    }
	
	public Long getAccountNum() {
		return accountNum;
	}
	public void setAccountNumber(Long accountNum) {
		this.accountNum = accountNum;
	}
	public Date getValueDate() {
		return valueDate;
	}
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	
}
