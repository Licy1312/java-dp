package com.design.pattern.proxy;

/**
 * Description: 支付能力的实现类（银行）
 * @Author:Jinmu
 * Date: 2017/11/13
 */
public class BankPaymentImpl implements PaymentSubject {

    /**
     * 代理对象完成支付过程
     */
    @Override
    public void paymentProcess() {
        System.out.println("你好,已经完成对订单的支付!");
    }
}
