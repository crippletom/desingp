package cn.qu.dp.part2.cpt17;

public class Client {

	public static void main(String[] args) {
		
		//被修饰对象
		Component component=new ConcreteComponent();
		
		//第一次装饰
		component=new ConcreteDecorator1(component);
		//第二次装饰
		component=new ConcreteDecorator2(component);
		
		component.operate();
		
	}
}
