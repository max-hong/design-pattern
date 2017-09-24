package com.imooc.pattern.observer;
/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * @author honghao
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject {

	private String weatherContext;
	
	/**
	 * @return the weatherContext
	 */
	public String getWeatherContext() {
		return weatherContext;
	}

	/**
	 * @param weatherContext the weatherContext to set
	 */
	public void setWeatherContext(String weatherContext) {
		this.weatherContext = weatherContext;
		//内容有了，说明天气更新了，通知所有订阅的人
		this.notifyObservers();
	}
}
