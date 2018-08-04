package com.design.pattern.observer;

import com.design.pattern.observer.server.ShanghaiWeatherServerImpl;
import com.design.pattern.observer.subscriber.CityServerSubscriberImpl;
import com.design.pattern.observer.subscriber.TravelAgentSubscriberImpl;

/**
 * @instruction: 测试类
 * @author: lichangya_dxm
 * @date: 2018/8/4
 */
public class WeatherTestApp {

    public static void main(String[] args){
        ShanghaiWeatherServerImpl shanghaiWeatherServer = new ShanghaiWeatherServerImpl();
        shanghaiWeatherServer.setLatestWeatherInfo("晴，温度是29.5℃，风速为3级，注意防晒!");

        TravelAgentSubscriberImpl travelAgentSubscriber = new TravelAgentSubscriberImpl();
        shanghaiWeatherServer.attach(travelAgentSubscriber);

        CityServerSubscriberImpl cityServerSubscriber = new CityServerSubscriberImpl();
        shanghaiWeatherServer.attach(cityServerSubscriber);

        shanghaiWeatherServer.inform();
    }
}
