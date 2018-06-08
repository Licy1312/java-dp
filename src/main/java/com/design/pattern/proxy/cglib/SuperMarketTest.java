package com.design.pattern.proxy.cglib;

/**
 * Description:测试类，模拟真实的需要支付业务的超市
 *
 * @Author:Jinmu
 * Date: 2018/6/8
 */
public class SuperMarketTest {
    public static void main(String[] args) {

        //创建目标对象(银行)
        BankPaymentService paymentService = new BankPaymentService();

        //创建代理对象(支付机构)
        BankPaymentService proxyPayment = (BankPaymentService)new PaymentProxyFactory(paymentService).getProxyInstance();

        //进行支付
        proxyPayment.paymentProcess();
    }
}
