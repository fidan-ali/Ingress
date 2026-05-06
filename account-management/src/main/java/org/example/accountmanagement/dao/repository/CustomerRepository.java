package org.example.accountmanagement.dao.repository;

import org.example.accountmanagement.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("select c from Customer c INNER JOIN c.accounts a WHERE a.balance > :minBalance")
    List<Customer> findCustomersWithBalanceGreaterThan(@Param("minBalance") Double minBalance);
}
