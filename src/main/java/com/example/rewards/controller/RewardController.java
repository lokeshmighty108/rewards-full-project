package com.example.rewards.controller;

import com.example.rewards.dto.*;
import com.example.rewards.service.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rewards")
public class RewardController {
	private final RewardService service;

	public RewardController(RewardService s) {
		this.service = s;
	}

	@GetMapping("/{id}")
	public RewardResponse get(@PathVariable Long id) {
		return service.getRewardsByCustomer(id);
	}
}