package cn.qu.dp.part2.cpt14;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	//自发方法1
	public void selfMethod1() {
		System.out.println("ConcreteColleague2.selfMethod1");
	}
	//自发方法2
	public void selfMethod2() {
		System.out.println("ConcreteColleague2.selfMethod2");
	}
	
	//依赖方法
	public void depMethod1() {
		//实现自己的逻辑...
		System.out.println("ConcreteColleague2.depMethod1");
		//调用中介者 和 其他同事类交互
		super.mediator.doSomething1();
	}
	
}
