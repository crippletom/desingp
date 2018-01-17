package cn.qu.dp.part2.cpt26.common;

public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		this.context.setState(Context.state1);
		this.context.handle1();
	}

	@Override
	public void handle2() {
		System.out.println("handle2");
	}

}
