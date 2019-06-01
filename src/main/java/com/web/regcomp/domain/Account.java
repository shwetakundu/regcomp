package com.web.regcomp.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ACCOUNT")
public class Account {
	
	@Id
	@Column(name="ACCOUNT_NUMBER")
    private Long accountNumber;
	@Column(name="ACCOUNT_NAME")
	private String accountName;
	@Column(name="ACCOUNT_TYPE")
	private String accountType;
	@Column(name="BALANCE_DATE")
	private Date balanceDate;
	@Column(name="CURRENCY")
	private String currency;
	@Column(name="AVAILABLE_BALANCE")
	private Double availableBalance;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    private List<Transaction> transactions;

    public Account() {
    	
    }

    public Account(Long accountNumber, String accountName, String accountType, Date balanceDate,
    		String currency, Double availableBalance, List<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountType = accountType;
        this.balanceDate = balanceDate;
        this.currency = currency;
        this.availableBalance = availableBalance;
        this.transactions = transactions;
    }

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Date getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(Double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
        	
}
