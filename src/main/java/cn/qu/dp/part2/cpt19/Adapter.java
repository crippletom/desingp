package cn.qu.dp.part2.cpt19;

public class Adapter extends Adaptee implements Target {

	public void request() {
		this.doSomething();
	}

}
