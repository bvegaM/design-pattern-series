package org.bvega.strategy.impl;

import static org.bvega.utils.Constant.REWARD_SPENT;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.bvega.strategy.RewardStrategy;

public class EliteMembershipStrategy implements RewardStrategy {

  private static final BigDecimal REWARD_POINTS = BigDecimal.valueOf(10);

  @Override
  public BigDecimal calculateRewardPoints(BigDecimal amountSpent) {
      BigDecimal points = amountSpent.divide(REWARD_SPENT, 0, RoundingMode.FLOOR)
        .multiply(REWARD_POINTS);

    if (amountSpent.compareTo(BigDecimal.valueOf(100)) > 0) {
      points = points.add(BigDecimal.valueOf(10));
    }
    return points;
  }
}
