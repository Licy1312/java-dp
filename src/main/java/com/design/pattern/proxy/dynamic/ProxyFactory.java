package com.design.pattern.proxy.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description: 代理工厂类
 * @Author:Jinmu
 * Date: 2017/11/13
 */
public class ProxyFactory implements InvocationHandler {

    //维护通用目标对象
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }

    /**生成通用代理对象
     *
     1. 动态代理类的引用，通常情况下不需要它。但可以使用getClass()方法，得到proxy的Class类从而取得实例的类信息，如方法列表，annotation等。
     2. 方法对象的引用，代表被动态代理类调用的方法。从中可得到方法名，参数类型，返回类型等等
     3. args对象数组，代表被调用方法的参数。注意基本类型(int,long)会被装箱成对象类型(Interger, Long)
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object proxyObject = method.invoke(target,args);
        return proxyObject;
    }
}
