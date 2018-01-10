package cn.qu.dp.part2.cpt09;

public abstract class AbstractProductA {
	
	/**
	 * 产品共有方法
	 */
	public void method() {
		System.out.println("A类产品");
	}
	
	/**
	 * 产品相同方法，不同实现
	 */
	public abstract void doSomeThing();

}
