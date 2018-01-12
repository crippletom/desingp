package cn.qu.dp.part2.cpt18;

public class Context {
	
	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public Context(Strategy strategy) {
		this.strategy=strategy;
	}
	
	//封装后的策略方法
	public void doAnything() {
		this.strategy.doSomething();
	}

}
