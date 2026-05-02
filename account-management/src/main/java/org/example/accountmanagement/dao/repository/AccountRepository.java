package org.example.accountmanagement.dao.repository;

import org.example.accountmanagement.dao.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
