package com.example.rewards.service.impl;

import com.example.rewards.dto.*;
import com.example.rewards.entity.*;
import com.example.rewards.repository.*;
import com.example.rewards.service.*;
import com.example.rewards.util.*;
import org.springframework.stereotype.*;
import java.util.*;

@Service
public class RewardServiceImpl implements RewardService {
	private final TransactionRepository repo;

	public RewardServiceImpl(TransactionRepository r) {
		this.repo = r;
	}

	public RewardResponse getRewardsByCustomer(Long id) {
		List<Transaction> tx = repo.findByCustomerId(id);
		RewardResponse r = new RewardResponse();
		r.customerId = id;
		r.monthlyRewards = new HashMap<>();
		int total = 0;
		for (Transaction t : tx) {
			int p = RewardUtil.calculate(t.getAmount());
			total += p;
			String m = t.getTransactionDate().getMonth().toString();
			r.monthlyRewards.merge(m, p, Integer::sum);
			r.customerName = t.getCustomerName();
		}
		r.totalRewards = total;
		return r;
	}
}