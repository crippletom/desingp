package cn.qu.dp.part2.cpt25;

public class ConcreteElement1 extends Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void doSomething() {
		System.out.println("1");
	}

}
