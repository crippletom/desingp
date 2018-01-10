package cn.qu.dp.part2.cpt09;

public abstract class AbstractProductB {

	/**
	 * 产品共有方法
	 */
	public void method() {
		System.out.println("B类产品");
	}
	
	/**
	 * 产品相同的方法，不同的实现
	 */
	public abstract void doSomeThing();
	
}
