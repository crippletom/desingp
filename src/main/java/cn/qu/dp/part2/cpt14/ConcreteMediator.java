package cn.qu.dp.part2.cpt14;

public class ConcreteMediator extends Mediator {

	@Override
	public void doSomething1() {
		System.out.println("ConcreteMediator.doSomething1");
		super.colleague1.selfMethod2();
	}

	@Override
	public void doSomething2() {
		System.out.println("ConcreteMediator.doSomething2");
		super.colleague2.selfMethod1();
	}

}
