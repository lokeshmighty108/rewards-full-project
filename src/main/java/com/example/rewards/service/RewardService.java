package com.example.rewards.service;

import com.example.rewards.dto.RewardResponse;

public interface RewardService {
	RewardResponse getRewardsByCustomer(Long id);
}