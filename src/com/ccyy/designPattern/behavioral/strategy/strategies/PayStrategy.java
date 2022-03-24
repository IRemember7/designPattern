package com.ccyy.designPattern.behavioral.strategy.strategies;

/**
 * @author: lianghanmao
 * @create: 2022-03-24
 * @description: 通用接口的支付方法接口
 **/
public interface PayStrategy {
    /**
     * 支付
     * @param paymentAmount
     * @return
     */
    boolean pay(Integer paymentAmount);

    /**
     * 收取付款明细
     */
    void collectPaymentDetails();
}
