package com.web.regcomp.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTION")
public class Transaction {
	
	@EmbeddedId TransactionId transactionId;
	
	@Column(name="NARRATIVE")
	private String narrative;	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ACCOUNT_NUM", insertable = false, updatable = false)
	private Account account;
	
	public Transaction() {
    	
    }

    public Transaction(TransactionId transactionId, String narrative, Account account) {
        this.transactionId = transactionId;
        this.narrative = narrative;
        this.account = account;
    }
	
	public TransactionId getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(TransactionId transactionId) {
		this.transactionId = transactionId;
	}

	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	    	
}
