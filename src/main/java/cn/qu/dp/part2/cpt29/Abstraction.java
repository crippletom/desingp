package cn.qu.dp.part2.cpt29;

public abstract class Abstraction {
	
	private Implementor imp;

	public Abstraction(Implementor imp) {
		this.imp=imp;
	}

	public Implementor getImp() {
		return imp;
	}
	
	public void request() {
		
		imp.doSomething();
	}
	
}
