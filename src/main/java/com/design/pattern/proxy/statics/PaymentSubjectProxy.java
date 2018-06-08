package com.design.pattern.proxy.statics;


import com.design.pattern.proxy.PaymentSubject;

/**
 * Description: 支付能力的代理类(第三方支付公司)
 * @Author:Jinmu
 * Date: 2017/11/13
 */
public class PaymentSubjectProxy implements PaymentSubject {
    private PaymentSubject target;

    public PaymentSubjectProxy(PaymentSubject target){
        this.target = target;
    }

    /**
     * 支付过程
     */
    @Override
    public void paymentProcess() {
        target.paymentProcess();
    }
}
