package cn.qu.dp.part2.cpt23;

public class Facade {
	
	private ClassA classa=new ClassA();
	private ClassB classb=new ClassB();
	private ClassC classc=new ClassC();
	
	public void methodA() {
		this.classa.doSomethingA();
	}
	
	public void methodB() {
		this.classb.doSomethingB();
	}
	
	public void methodC() {
		this.classc.doSomethingC();
	}

}
