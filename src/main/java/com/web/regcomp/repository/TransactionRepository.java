package com.web.regcomp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.web.regcomp.domain.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	
	@Query("SELECT t FROM Transaction t WHERE t.transactionId.accountNum = :accountNum")
	public List<Transaction> findByAccountNum(@Param("accountNum") Long accountNum);

}
