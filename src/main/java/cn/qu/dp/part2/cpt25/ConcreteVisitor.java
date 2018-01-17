package cn.qu.dp.part2.cpt25;

public class ConcreteVisitor implements Visitor {

	public void visit(ConcreteElement1 element) {
		element.doSomething();
	}

	public void visit(ConcreteElement2 element) {
		element.doSomething();
	}

}
