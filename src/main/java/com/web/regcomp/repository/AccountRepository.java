package com.web.regcomp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.regcomp.domain.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
