package cn.qu.dp.part2.cpt17;

public class ConcreteDecorator2 extends Decorator {
	
	public ConcreteDecorator2(Component component) {
		super(component);
	}
	
	private void method2() {
		System.out.println("method2 装饰...");
	}

	@Override
	public void operate() {
		this.method2();
		super.operate();
	}

}
