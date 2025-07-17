package com.salesapp.repository;

import com.salesapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByCustomerCode(String customerCode);
    Optional<Customer> findByEmail(String email);
    boolean existsByCustomerCode(String customerCode);
    boolean existsByEmail(String email);
    Optional<Customer> findByUserId(Long userId);
} 