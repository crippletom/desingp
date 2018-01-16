package cn.qu.dp.part2.cpt22.common;

public class ConcreteSubject extends Subject {
	
	public void doSomething() {
		/**
		 * 实现业务逻辑
		 */
		this.notifyObservers();
	}

}
