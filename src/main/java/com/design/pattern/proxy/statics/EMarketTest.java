package com.design.pattern.proxy.statics;

import com.design.pattern.proxy.PaymentSubject;
import com.design.pattern.proxy.BankPaymentImpl;

/**
 * Description:测试类(电商平台)、静态代理方式
 * @Author:Jinmu
 * Date: 2017/11/13
 */
public class EMarketTest {
    public static void main(String[] args){
        //目标对象
        PaymentSubject paymentSubject = new BankPaymentImpl();

        //代理对象
        PaymentSubject paymentSubjectProxy = new PaymentSubjectProxy(paymentSubject);

        //进行支付
        paymentSubjectProxy.paymentProcess();

    }
}
