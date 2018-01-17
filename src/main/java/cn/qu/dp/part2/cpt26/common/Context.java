package cn.qu.dp.part2.cpt26.common;

public class Context {
	
	public final static ConcreteState1 state1=new ConcreteState1();
	
	public final static ConcreteState2 state2=new ConcreteState2();
	
	private State state;
	
	public void setState(State state) {
		this.state=state;
		this.state.setContext(this);
	}
	
	public void handle1() {
		this.state.handle1();
	}
	
	public void handle2() {
		this.state.handle2();
	}

}
