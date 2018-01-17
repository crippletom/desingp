package cn.qu.dp.part2.cpt25;

public abstract class Element {
	
	public abstract void accept(Visitor visitor);
	
	public abstract void doSomething();

}
