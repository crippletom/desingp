package cn.qu.dp.part2.cpt14;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	// 自发方法1
	public void selfMethod1() {
		System.out.println("ConcreteColleague1.selfMethod1");
	}

	// 自发方法2
	public void selfMethod2() {
		System.out.println("ConcreteColleague1.selfMethod2");
	}
	
	//依赖方法
	public void depMethod1() {
		//
		System.out.println("ConcreteColleague1.depMethod1");
		//
		super.mediator.doSomething2();
	}
}
