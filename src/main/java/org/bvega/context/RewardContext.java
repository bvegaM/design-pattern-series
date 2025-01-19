package org.bvega.context;

import java.math.BigDecimal;
import org.bvega.strategy.RewardStrategy;

public class RewardContext {

  private RewardStrategy rewardStrategy;


  public void setRewardStrategy(RewardStrategy rewardStrategy) {
    this.rewardStrategy = rewardStrategy;
  }

  public BigDecimal executeStrategy(BigDecimal amountSpent){
    return rewardStrategy.calculateRewardPoints(amountSpent);
  }

}
