package org.bvega;


import java.math.BigDecimal;
import java.util.logging.Logger;
import org.bvega.context.RewardContext;
import org.bvega.strategy.impl.BasicMembershipStrategy;
import org.bvega.strategy.impl.EliteMembershipStrategy;
import org.bvega.strategy.impl.PremiumMembershipStrategy;
import org.bvega.strategy.impl.VIPMembershipStrategy;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args){
        RewardContext rewardContext = new RewardContext();
        BigDecimal amountSpent = BigDecimal.valueOf(120);

        rewardContext.setRewardStrategy(new BasicMembershipStrategy());
        BigDecimal basicPoints = rewardContext.executeStrategy(amountSpent);
        log.info("Basic membership points: " + basicPoints);

        rewardContext.setRewardStrategy(new PremiumMembershipStrategy());
        BigDecimal premiumPoints = rewardContext.executeStrategy(amountSpent);
        log.info("Premium membership points: " + premiumPoints);

        rewardContext.setRewardStrategy(new VIPMembershipStrategy());
        BigDecimal vipPoints = rewardContext.executeStrategy(amountSpent);
        log.info("VIP membership points: " + vipPoints);

        rewardContext.setRewardStrategy(new EliteMembershipStrategy());
        BigDecimal elitePoints = rewardContext.executeStrategy(amountSpent);
        log.info("Elite membership points: " + elitePoints);
    }
}