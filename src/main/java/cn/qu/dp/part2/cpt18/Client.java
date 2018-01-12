package cn.qu.dp.part2.cpt18;

public class Client {

	public static void main(String[] args) {
		//声明一个策略
		Strategy strategy1=new ConcreteStrategy1();
		Strategy strategy2=new ConcreteStrategy2();
		
		//声明上下文
		Context context=new Context(strategy1);
		//执行封装后的方法
		context.doAnything();
		
		//更换策略
		context.setStrategy(strategy2);
		context.doAnything();
	}
}
