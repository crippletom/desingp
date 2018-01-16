package cn.qu.dp.part2.cpt22.common;

import java.util.Vector;

public abstract class Subject {
	
	private Vector<Observer> observers = new Vector<Observer>();
	
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	public void delObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer:observers) {
			observer.update();
		}
	}

}
