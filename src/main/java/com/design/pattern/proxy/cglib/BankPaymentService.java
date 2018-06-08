package com.design.pattern.proxy.cglib;

/**
 * Description:子类代理
 *
 * @Author:Jinmu Date: 2018/6/8
 */
public class BankPaymentService {

    /**
     * 如果声明为static 或者 final 代理工厂中扩展业务无法实现
     */
    public void paymentProcess(){
        System.out.println("你好,已经完成对订单的支付!");
    }
}
