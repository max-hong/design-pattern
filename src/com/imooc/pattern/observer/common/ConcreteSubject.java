package com.imooc.pattern.observer.common;
/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * @author honghao
 *
 */
public class ConcreteSubject extends Subject {

	private String subjectState;
	
	/**
	 * @return the subjectState
	 */
	public String getSubjectState() {
		return subjectState;
	}

	/**
	 * @param subjectState the subjectState to set
	 */
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObservers();
	}
}
