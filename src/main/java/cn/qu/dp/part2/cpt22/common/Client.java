package cn.qu.dp.part2.cpt22.common;

public class Client {

	public static void main(String[] args) {
		//创建一个被观察者
		ConcreteSubject subject=new ConcreteSubject();
		
		//添加观察者
		Observer observer=new ConcreteObserver();
		subject.addObserver(observer);
		
		//被观察者活动，观察者开始工作
		subject.doSomething();
		
	}

}
