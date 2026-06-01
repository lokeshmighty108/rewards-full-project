package com.example.rewards;

import com.example.rewards.util.RewardUtil;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class RewardUtilTest {
	@Test
	void test() {
		assertEquals(90, RewardUtil.calculate(120));
	}
}