package cn.qu.dp.part2.cpt22.common;

public class ConcreteObserver implements Observer {

	public void update() {
		System.out.println("接收到信息，并进行处理。");
	}

}
