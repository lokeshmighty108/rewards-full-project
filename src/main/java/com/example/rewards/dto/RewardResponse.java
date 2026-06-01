package com.example.rewards.dto;

import java.util.*;

public class RewardResponse {
	public Long customerId;
	public String customerName;
	public Map<String, Integer> monthlyRewards;
	public Integer totalRewards;
}