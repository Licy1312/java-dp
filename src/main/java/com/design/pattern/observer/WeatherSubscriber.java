package com.design.pattern.observer;

/**
 * @instruction: 天气订阅者接口 （观察者，即订阅者）
 * @author: lichangya_dxm
 * @date: 2018/8/4
 */
public interface WeatherSubscriber {

    /**
     * 接收消息
     * @param weatherInfo 天气消息
     */
    void receive(String weatherInfo);
}
