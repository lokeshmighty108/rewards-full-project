package com.example.rewards.entity;

import jakarta.persistence.*;
import java.time.*;

@Entity
@Table(name = "transactions")
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long customerId;
	private String customerName;
	private Double amount;
	private LocalDate transactionDate;

	public Transaction() {
	}

	public Long getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public Double getAmount() {
		return amount;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}
}