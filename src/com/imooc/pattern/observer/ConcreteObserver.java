package com.imooc.pattern.observer;

/**
 * 具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * @author honghao
 *
 */
public class ConcreteObserver implements Observer{
	//观察者的名字，是谁收到了这个信息，黄明的女朋友还是她老妈
	private String observerName;
	
	//天气内容
	private String weatherContext;
	
	//提醒信息
	private String remindThing;
	
	/**
	 * 获取目标类的状态同步到观察者的状态
	 */
	@Override
	public void update(WeatherSubject subject) {
		weatherContext=((ConcreteWeatherSubject) subject).getWeatherContext();
		System.out.println(observerName+"收到了:"+weatherContext+","+remindThing);
	}

	/**
	 * @return the observerName
	 */
	public String getObserverName() {
		return observerName;
	}

	/**
	 * @param observerName the observerName to set
	 */
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}


	/**
	 * @return the remindThing
	 */
	public String getRemindThing() {
		return remindThing;
	}

	/**
	 * @param remindThing the remindThing to set
	 */
	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

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
	}
	
	
}
