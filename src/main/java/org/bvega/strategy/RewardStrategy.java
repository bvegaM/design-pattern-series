package org.bvega.strategy;

import java.math.BigDecimal;

public interface RewardStrategy {

  BigDecimal calculateRewardPoints(BigDecimal amountSpent);

}
