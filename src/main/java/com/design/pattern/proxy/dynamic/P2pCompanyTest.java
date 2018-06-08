package com.design.pattern.proxy.dynamic;

import com.design.pattern.proxy.PaymentSubject;
import com.design.pattern.proxy.BankPaymentImpl;

import java.lang.reflect.Proxy;

/**
 * Description: 测试类，构造真实的需要支付业务的P2P公司
 *
 * @Author:Jinmu Date: 2018/6/8
 */
public class P2pCompanyTest {

    public static void main(String[] args) {
        //创建目标
        PaymentSubject paymentTarget = new BankPaymentImpl();

        //创建代理
        final Class<?>[] interfaces = new Class[]{PaymentSubject.class};
        PaymentSubject proxyPayment = (PaymentSubject) Proxy.newProxyInstance(PaymentSubject.class.getClassLoader(),
                interfaces,new ProxyFactory(paymentTarget));

        //进行支付
        proxyPayment.paymentProcess();
    }
}
