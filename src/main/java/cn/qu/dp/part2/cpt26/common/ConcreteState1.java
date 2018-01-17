package cn.qu.dp.part2.cpt26.common;

public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		System.out.println("handle1");
	}

	@Override
	public void handle2() {
		this.context.setState(Context.state2);
		this.context.handle2();
	}

}
