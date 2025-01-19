package org.bvega.strategy.impl;

import static org.bvega.utils.Constant.REWARD_SPENT;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.bvega.strategy.RewardStrategy;

public class PremiumMembershipStrategy implements RewardStrategy {

  private static final BigDecimal REWARD_POINTS = BigDecimal.valueOf(2);
  @Override
  public BigDecimal calculateRewardPoints(BigDecimal amountSpent) {
    return amountSpent.divide(REWARD_SPENT, 0, RoundingMode.FLOOR)
        .multiply(REWARD_POINTS);
  }
}
