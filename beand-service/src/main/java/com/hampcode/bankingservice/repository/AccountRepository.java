package com.hampcode.bankingservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hampcode.bankingservice.model.entities.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
    Optional<Account> findByOwnerEmail(String ownerEmail);
}
