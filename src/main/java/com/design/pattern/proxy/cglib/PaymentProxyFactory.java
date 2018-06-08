package com.design.pattern.proxy.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description: 支付代理工厂，这里使用的是spring-core内部工具类
 *
 * @Author:Jinmu Date: 2018/6/8
 */
public class PaymentProxyFactory implements MethodInterceptor {
    //维护通用目标对象
    private Object target;
    public PaymentProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance() {
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置代理的父类
        enhancer.setSuperclass(target.getClass());
        //回调函数
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //1.扩展事务
        System.out.println("扩展1");
        Object proxyObject = method.invoke(target,objects);
        //2.扩展事务
        System.out.println("扩展2");
        return proxyObject;
    }
}
