package com.capgemini.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.Transaction;
@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long>{

}
