package com.ccyy.designPattern.behavioral.strategy.entity;

import com.ccyy.designPattern.behavioral.strategy.strategies.PayStrategy;

/**
 * @author: lianghanmao
 * @create: 2022-03-24
 * @description: 订单
 **/
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Here we could collect and store payment data from the strategy.
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
