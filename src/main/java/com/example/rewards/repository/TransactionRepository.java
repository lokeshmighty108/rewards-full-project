package com.example.rewards.repository;

import com.example.rewards.entity.Transaction;
import org.springframework.data.jpa.repository.*;
import java.util.*;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	List<Transaction> findByCustomerId(Long customerId);
}