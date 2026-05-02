package org.example.accountmanagement.dao.repository;

import org.example.accountmanagement.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
